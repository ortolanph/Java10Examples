package org.java10.examples.access;

public class AccessorsExample2 {

    public static void main(String[] args) {
        var accessorTest = new Accessors() {
            public void accessorResult() {
                System.out.println(String.format("Accessing publicAccessor member: %s", publicAccessor));
                System.out.println(String.format("Accessing protectedAccessor member: %s", protectedAccessor));
                System.out.println(String.format("Accessing defaultAccessor member: %s", defaultAccessor));
            }
        };

        accessorTest.accessorResult();
    }

}
