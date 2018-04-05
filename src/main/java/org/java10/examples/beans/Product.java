package org.java10.examples.beans;

public class Product {

    private final float price;
    private final float tax;

    public Product(float price, float tax) {
        this.price = price;
        this.tax = tax;
    }

    public float getPrice() {
        return price;
    }

    public float getTax() {
        return tax;
    }

    public float calculateTotal() {
        return price + tax;
    }

    public float applyDiscount(float discount) {
        return (price - (price * discount)) + tax;
    }
}
