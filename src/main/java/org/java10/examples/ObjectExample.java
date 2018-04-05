package org.java10.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ObjectExample {

    public static void main(String[] args) {
        var string = "This is a String";

        var now = LocalDate.now();

        var formatter = DateTimeFormatter.ISO_DATE;

        var stringList = new ArrayList<String>();

        stringList.add("All");
        stringList.add("Java");
        stringList.add("developers");
        stringList.add("have");
        stringList.add("type");
        stringList.add("inference");
        stringList.add("now");
        stringList.add("!");


        System.out.println(string);
        System.out.println(now.format(formatter));
        System.out.println(stringList);
    }
}
