package org.java10.examples.beans;

public class ProductLine {

    private final Product product;
    private final DiscoutType discoutType;
    private final float discount;

    private ProductLine(Product product, DiscoutType discoutType, float discount) {
        this.product = product;
        this.discoutType = discoutType;
        this.discount = discount;
    }

    public static ProductLine newLine(Product product, DiscoutType discoutType, float discount) {
        return new ProductLine(product, discoutType, discount);
    }

    public DiscoutType getDiscoutType() {
        return discoutType;
    }

    public Product getProduct() {
        return product;
    }

    public float getDiscount() {
        return discount;
    }
}
