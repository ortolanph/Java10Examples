package org.java10.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ObjectExample {

    public static void main(String[] args) {
        var hello = "Hello! This is an inferred String!";

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

        System.out.println("Printing a String: ");
        System.out.println(hello);
        System.out.println("\nPrinting a formatted LocalDate: ");
        System.out.println(now.format(formatter));
        System.out.println("\nPrinting a String List: ");
        System.out.println(stringList);

        System.out.println("\nPrinting the inferred classes: ");
        System.out.println(hello.getClass());
        System.out.println(now.getClass());
        System.out.println(formatter.getClass());
        System.out.println(stringList.getClass());

        System.out.println("\nListing with for-each");
        for(var string : stringList) {
            System.out.println(string);
        }

        System.out.println("\nReading a file with try-with-resources");
        try(var fileReader = new FileReader("README.md")) {
            var buffer = new char[1024];

            while(fileReader.read(buffer) > 0) {
                System.out.println(new String(buffer));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
