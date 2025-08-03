// package Lab_05;
import java.util.Arrays;
public class Triangle {

    private double sideA, sideB, sideC;
    private static int objectCount = 0;

    public Triangle() {
        this.sideA = 1.0;
        this.sideB = 1.0;
        this.sideC = 1.0;
        objectCount++;
    }

    public Triangle(double side) {
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
        objectCount++;
    }

    public Triangle(double x, double y) {
        this.sideA = x;
        this.sideB = x;
        this.sideC = y;
        objectCount++;
    }

    public Triangle(double x, double y, double z) {
        this.sideA = x;
        this.sideB = y;
        this.sideC = z;
        objectCount++;
    }

    public Triangle(Triangle other) {
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
        objectCount++;
    }

    public static int ObjectCount() {
        return objectCount;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double a) {
        this.sideA = a;
    }

    public void setSideB(double b) {
        this.sideB = b;
    }

    public void setSideC(double c) {
        this.sideC = c;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public boolean isRightAngled() {
        // A triangle is right angled only when the square and sum of two sides is equal to sum of square of other side.
        // Pythagoras Theorem says: H^2=P^2+B^2
        // For Sorting we will use array

        double[] side={sideA,sideB,sideC};
        Arrays.sort(side);

        double p=side[0];
        double b=side[1];
        double h=side[2];
        
        if ((p*p + b*b) ==(h*h)) {

            return true;
        }
        else{

            return false; 
        }
    }

    @Override
    public String toString(){
        String sides="\nside A : "+sideA+"\nside B : "+sideB+"\nside C : "+sideC;
        return sides; 
    }
}
