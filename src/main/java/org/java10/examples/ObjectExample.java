package org.java10.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ObjectExample {

    public static void main(String[] args) {
        var string = "This is a String";

        var now = LocalDate.now();

        var formatter = DateTimeFormatter.ISO_DATE;

        System.out.println(string);
        System.out.println(now.format(formatter));
    }
}
