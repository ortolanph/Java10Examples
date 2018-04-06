package org.java10.examples;

import org.java10.examples.access.Accessors;

public class AccessorsExample {

    public static void main(String[] args) {
        var accessorTest = new Accessors() {
            public void accessorResult() {
                System.out.println(publicAccessor);
                System.out.println(protectedAccessor);
            }
        };

        accessorTest.accessorResult();
    }

}
