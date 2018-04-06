package org.java10.examples;

import org.java10.examples.mixin.Flyer;
import org.java10.examples.mixin.Navigable;
import org.java10.examples.mixin.Vehicle;

public class MixinExample {

    public static void main(String[] args) {
        var seaplane = (Navigable & Flyer) Vehicle::create;

        System.out.println("------------------------------------");
        System.out.println("Start!");
        System.out.println("------------------------------------");

        seaplane.takeOff();
        seaplane.fly();
        seaplane.land();
        seaplane.starboard();
        seaplane.port();
        seaplane.anchorDown();
        seaplane.anchorUp();
        seaplane.sail();

        System.out.println("\n------------------------------------");
        System.out.println("What class is this?");
        System.out.println("------------------------------------");

        System.out.println(seaplane.getClass());

        System.out.println("\n------------------------------------");
        System.out.println("Instance of ...");
        System.out.println("------------------------------------");

        System.out.println("seaplane instanceof Vehicle = " + (seaplane instanceof Vehicle));
        System.out.println("seaplane instanceof Flyer = " + (seaplane instanceof Flyer));
        System.out.println("seaplane instanceof Navigable = " + (seaplane instanceof Navigable));

    }

}
