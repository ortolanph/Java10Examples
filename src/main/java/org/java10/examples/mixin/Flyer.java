package org.java10.examples.mixin;

public interface Flyer extends Vehicle {

    default void takeOff() {
        System.out.println("Taking off! Up, up and away!");
    }

    default void land() {
        System.out.println("Tripulation, prepare for landing!");
    }

    default void fly() {
        System.out.println("Flying!");
    }

}
