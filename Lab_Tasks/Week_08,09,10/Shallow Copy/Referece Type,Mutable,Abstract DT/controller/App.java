package controller;

import model.Array;

public class App {

    public void run() throws CloneNotSupportedException {

        Array a = new Array();
        Array b;

        System.out.println("Original Value of A: " + a);

        // Make a clone of a
        b = (Array) a.clone();
        System.out.println("Value of B (cloned from A): " + b);

        // Modifying B
        b.setIndexValue(0, 10);
        System.out.println("B after changing index 0: " + b);
        System.out.println("A after changing B: " + a);

        // Here we conclude that super.clone make shallow copy of abstract data type,reference type and mutable.
    }
}
