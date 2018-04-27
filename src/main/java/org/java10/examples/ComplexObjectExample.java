package org.java10.examples;

import org.java10.examples.beans.Bill;
import org.java10.examples.beans.DiscoutType;
import org.java10.examples.beans.Product;

public class ComplexObjectExample {

    public static void main(String[] args) {
        var bill = Bill.newBill();

        var productLaptop = new Product("Good Laptop", 1000f, 10f);
        var productGamerMouse = new Product("Gamer Mouse", 20f, 1);
        var productGamerKeyboard = new Product("Gamer Keyboard",15, 1);
        var productUSBController = new Product("USB Controller", 35, 2);

        bill
            .addProduct(productLaptop, DiscoutType.COMMON_DISCOUNT, 0.15f)
            .addProduct(productGamerMouse, DiscoutType.INTERNET_DISCOUNT, 0f)
            .addProduct(productGamerKeyboard, DiscoutType.NO_DISCOUNT, 0f)
            .addProduct(productUSBController, DiscoutType.COMMON_DISCOUNT, 0.20f);

        var productList = bill.productList();

        System.out.println("-[ Bill ]-----------------------------------------------------------");

        for(var product : productList) {
            System.out.println(product.toString());
        }

        System.out.println("--------------------------------------------------------------------");

        System.out.println(String.format("%44.2f", bill.total()));
        System.out.println(String.format("%68.2f", bill.taxes()));

        System.out.println("--------------------------------------------------------------------");
    }

}
