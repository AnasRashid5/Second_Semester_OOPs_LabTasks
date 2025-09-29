package app;

import models.geometry.Point;
import models.geometry.Triangle;

public class App {

    public void run() {
        System.out.println("============== GEOMETRY DEMO ==============");

        // Create individual points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Point 3: " + p3);

        // Create a triangle with the three points (composition)
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println("\nTriangle t1: " + t1);

        // Use clone (shallow copy in your current code)
        Triangle t2 = (Triangle) t1.clone();
        System.out.println("\nCloned Triangle t2: " + t2);

        // Show static object count
        System.out.println("\nTotal Triangles Created: " + Triangle.ObjectCount());

        // Modify t2 and check if it affects t1
        t2.setA(new Point(10, 10));
        System.out.println("\nAfter modifying t2:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }

}
