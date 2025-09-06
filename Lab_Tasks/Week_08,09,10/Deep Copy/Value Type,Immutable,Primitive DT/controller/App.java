package controller;

import model.Value;

public class App {

    public void run() throws CloneNotSupportedException {
        Value a = new Value();
        Value b;

        System.out.println("Original Value of A: " + a);

        // Clone object a into b
        b = (Value) a.clone();
        System.out.println("Value of B (cloned from A): " + b);

        // Modify B
        b.setValueOfInt(250);
        System.out.println("Value of B after changing B: " + b);
        System.out.println("Value of A after changing B: " + a);

        // Here we conclude that super.clone makes deep copy of primitve data types,immutable,Value type.
    }
}
