package org.java10.examples.beans;

public class Product {

    private final String name;
    private final float price;
    private final float tax;

    public Product(String name, float price, float tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
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

    @Override public String toString() {
        return String.format("%-20s\t%20.2f\t%20.2f", name, price, tax);
    }
}
