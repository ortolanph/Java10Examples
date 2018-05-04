package org.java10.examples;

import org.java10.examples.beans.Product;

public class ProductExample {

    public static void main(String[] args) {
        var modifiedProduct = new Product("An internet product", 8f, 0.5f) {
            public float applyInternetPrice() {
                return getPrice() - 1f + getTax();
            }
        };

        System.out.println("Modified product");
        System.out.println(modifiedProduct.calculateTotal());
        System.out.println(modifiedProduct.applyDiscount(0.15f));
        System.out.println(modifiedProduct.applyInternetPrice());
        System.out.println(modifiedProduct.getClass());
        System.out.println("----------------");

        var commonProduct = new Product("A not internet product", 8f, 0.5f);

        System.out.println("Common product");
        System.out.println(commonProduct.calculateTotal());
        System.out.println(commonProduct.applyDiscount(0.15f));
        System.out.println(commonProduct.getClass());
        System.out.println("--------------");
    }

}
