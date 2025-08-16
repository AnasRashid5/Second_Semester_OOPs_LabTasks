package geometry;

public class Point {

    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point doosraPoint) {
        this.x = doosraPoint.x;
        this.y = doosraPoint.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;
    }

    // === Combined Setter for Both x and y ===
    // Demonstrates method overloading
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point add(Point other) {
        return new Point(this.x + other.x, this.y + other.y);
    }

    @Override
    public String toString() {
        String points = "Point is at co-ordinates: " + x + "," + y;
        return points;
    }
}
