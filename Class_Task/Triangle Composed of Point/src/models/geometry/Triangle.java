package models.geometry;
import java.util.Arrays;

public class Triangle implements Cloneable {

    private Point A, B, C;
    private static int objectCount = 0;

    //static=modifier. A single copy of a variable/method is created and shared.
    // The class "owns" the static member..
    // can be called directly by writing a class name and then dot(.)
    //A function can also be made static. For eg:we use Math.round() we dont make an object to instantiate the math class.we only write class name and then . and then function name of that class. So here static is helping us.

    public Triangle() {
        this.A = new Point(1.0,1.0);
        this.B = new Point(1.0,1.0);
        this.C = new Point(1.0,1.0);
        objectCount++;
    }

    public Triangle(Point side) {
        this.A = new Point(side.getX(),side.getY());
        this.B = new Point(side.getX(),side.getY());
        this.C = new Point(side.getX(),side.getY());
        objectCount++;
    }

    public Triangle(Point x, Point y) {
        this.A = new Point(x.getX(),x.getY());
        this.B = new Point(y.getX(),y.getY());
        this.C = new Point(y.getX(),y.getY());
        objectCount++;
    }

    public Triangle(Point x, Point y, Point z) {
        this.A = new Point(x.getX(),x.getY());
        this.B = new Point(y.getX(),y.getY());
        this.C = new Point(z.getX(),z.getY());
        objectCount++;
    }

    // public Triangle(Triangle other) {
    // this.A = other.A;
    // this.B = other.B;
    // this.C = other.C;
    // objectCount++;
    // }

    public static int ObjectCount() {
        return objectCount;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public void setA(Point a) {
        this.A = a;
    }

    public void setB(Point b) {
        this.B = b;
    }

    public void setC(Point c) {
        this.C = c;
    }

    // public Point getPerimeter() {
    //     return A + B + C;
    // }

    // public boolean isRightAngled() {
    //     // A triangle is right angled only when the square and sum of two sides is equal
        // to sum of square of other side.
        // Pythagoras Theorem says: H^2=P^2+B^2
        // For Sorting we will use array

    //     Point[] side = { A, B, C };
    //     Arrays.sort(side);

    //     Point p = side[0];
    //     Point b = side[1];
    //     Point h = side[2];

    //     if ((p * p + b * b) == (h * h)) {

    //         return true;
    //     } else {

    //         return false;
    //     }
    // }

    @Override
    public String toString() {
        String sides = "\nside A : " + A + "\nside B : " + B + "\nside C : " + C;
        return sides;
    }

    @Override
    public Object clone() {
        try {
            objectCount++;
            return super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
            return null;
        }
    }
}