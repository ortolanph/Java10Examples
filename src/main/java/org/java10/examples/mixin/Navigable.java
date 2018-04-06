package org.java10.examples.mixin;

public interface Navigable extends Vehicle {

    default void starboard() {
        System.out.println("Starboard!");
    }

    default void port() {
        System.out.println("Port!");
    }

    default void sail() {
        System.out.println("Sailing!");
    }

    default void anchorUp() {
        System.out.println("The anchor is up! Ready to sail!");
    }

    default void anchorDown() {
        System.out.println("Anchor is down! Let's take some rest!");
    }

}
