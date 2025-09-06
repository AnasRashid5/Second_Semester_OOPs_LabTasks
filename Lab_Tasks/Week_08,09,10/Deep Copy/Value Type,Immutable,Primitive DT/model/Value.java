package model;

public class Value implements Cloneable {

    private int value = 100; // Value Type,Immutable,primitive DT

    public void increment() {

        value = value++;

    }

    public void setValueOfInt(int val) {
        value = val;
    }

    // @Override
    // public String toString() {
    // String s = "{",s2="";

    // for (int i = 0; i < arr.length; i++) {
    // s = s + arr[i];

    // if (i<arr.length-1) {
    // s = s + ",";
    // }
    // }

    // s=s+"}";
    // s2=Integer.toString(value);
    // return s+" is an array and "+s2+" is a value";

    // }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
