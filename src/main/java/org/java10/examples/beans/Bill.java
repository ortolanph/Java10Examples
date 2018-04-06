package org.java10.examples.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bill {

    private List<ProductLine> products;

    private Bill() {
        products = new ArrayList<>();
    }

    public static Bill newBill() {
        return new Bill();
    }

    public Bill addProduct(Product product, DiscoutType type, float discount) {
        products.add(ProductLine.newLine(product, type, discount));
        return this;
    }

    public List<Product> productList() {
        return products
            .stream()
            .map(ProductLine::getProduct)
            .collect(Collectors.toList());
    }

    public double total() {
        double total = 0d;

        for(ProductLine productLine : products) {
            switch (productLine.getDiscoutType()) {
                case COMMON_DISCOUNT:
                    total += productLine.getProduct().applyDiscount(productLine.getDiscount());
                    break;
                case INTERNET_DISCOUNT:
                    var internetProduct = new Product(productLine.getProduct().getName(), productLine.getProduct().getPrice(), productLine.getProduct().getTax()) {
                        public float applyInternetPrice() {
                            return getPrice() - 1f + getTax();
                        }
                    };

                    total += internetProduct.applyInternetPrice();
                    break;
                default:
                    total += productLine.getProduct().calculateTotal();
            }
        }

        return total;
    }

    public double taxes() {
        return productList()
            .stream()
            .mapToDouble(p -> p.getTax())
            .sum();
    }
}
