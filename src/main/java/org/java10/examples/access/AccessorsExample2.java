package org.java10.examples.access;

public class AccessorsExample2 {

    public static void main(String[] args) {
        var accessorTest = new Accessors() {
            public void accessorResult() {
                System.out.println(publicAccessor);
                System.out.println(protectedAccessor);
                System.out.println(defaultAccessor);
            }
        };

        accessorTest.accessorResult();
    }

}
