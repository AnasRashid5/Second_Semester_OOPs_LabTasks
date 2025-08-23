package vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vector implements Iterable<Double> {

    private List<Double> vectorList = new ArrayList<>();
    private boolean equality;

    // null constructor initial values zero.
    public Vector() {

    }

    // coordinates from user
    public Vector(double x, double y) {
        vectorList.add(x);
        vectorList.add(y);
    }

    public Vector(double x, double y, double z) {
        vectorList.add(x);
        vectorList.add(y);
        vectorList.add(z);
    }

    // public List clone(Vector other) {
    //     return this.vectorList = new ArrayList<>(other.vectorList);
    // }
    public double getComponent(int i) {
        return vectorList.get(i);
    }

    public void setComponent(int i, double val) {

        if (vectorList.size() <= i) {
            int temp = i - vectorList.size() + 1;
            for (int j = 0; j < temp; j++) {
                vectorList.add((double) (0));
            }
        }
        vectorList.set(i, val);
    }

    public int length() {
        return vectorList.size();
    }

    public Vector add(Vector other) {

        if (this.length() != other.length()) {
            throw new IllegalArgumentException("Vectors must have the same dimension for addition.");
        }

        Vector result = new Vector();

        for (int i = 0; i < this.length(); i++) {
            result.setComponent(i, this.getComponent(i) + other.getComponent(i));
        }
        return result;
    }

    public String dotProduct(Vector other) {

        if (this.length() != other.length()) {
            throw new IllegalArgumentException("Dot Product is only possible for vectors of the same dimension");
        }
        double dotResult = 0.0;
        for (int i = 0; i < length(); i++) {
            dotResult = dotResult + (this.getComponent(i) * other.getComponent(i));
        }
        return "Dot Product is: " + dotResult;

    }

    public boolean equals(Vector other) {
        if (this.length() != other.length()) {
            equality = false;
        } else {
            for (int i = 0; i < this.length(); i++) {
                if (this.getComponent(i) == other.getComponent(i)) {
                    equality = true;
                }
                else{
                    equality=false;
                    break;
                }
            }
        }
        return equality;
    }

    public String crossProduct(Vector other) {

        if (this.length() == 3 && other.length() == 3) {

            double ax = this.getComponent(0);
            double ay = this.getComponent(1);
            double az = this.getComponent(2);

            double bx = other.getComponent(0);
            double by = other.getComponent(1);
            double bz = other.getComponent(2);

            double cx = (ay * bz) - (az * by);
            double cy = (az * bx) - (ax * bz);
            double cz = (ax * by) - (ay * bx);

            return "Cross Product is :(" + cx + "," + cy + "," + cz+")";
        } else {
            throw new IllegalArgumentException("Cross Product is only possible for 3D Vectors");
        }

    }

    @Override
    public String toString() {
        String result = "Vector: (";

        for (int i = 0; i < vectorList.size(); i++) {
            result += vectorList.get(i);

            if (i < vectorList.size() - 1) {
                result += ", ";
            }
        }
        result += ")";
        return result;
    }

    @Override
    public Vector clone() {
        Vector cloned = new Vector();
        cloned.vectorList = new ArrayList<>(this.vectorList);
        return cloned;
    }

    @Override
    public Iterator<Double> iterator() {
        return vectorList.iterator();
    }
}
