package models.geometry;

public class Point {

    private double x;
    private double y;


    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point doosraPoint) {
        this.x = doosraPoint.x;
        this.y = doosraPoint.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;

    }

    public void setY(double y) {
        this.y = y;
    }

    // === Combined Setter for Both x and y ===
    // Demonstrates method overloading
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    @Override
    public String toString() {
        String doubles = "Point is at co-ordinates: " + x + "," + y;
        return doubles;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            throw new RuntimeException(e);

        }
    }
}