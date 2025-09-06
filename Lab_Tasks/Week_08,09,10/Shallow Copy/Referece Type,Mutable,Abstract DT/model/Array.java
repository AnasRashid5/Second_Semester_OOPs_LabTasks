package model;

import java.util.Arrays;

public class Array implements Cloneable {

    private int[] arr = { 1, 2, 3, 4, 5, 6 }; // Reference Type,Mutable,Abstract DT

    public void increment() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }

    }

    public void setIndexValue(int i, int val) {
        arr[i] = val;
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
        return Arrays.toString(arr);
    }

    @Override
    public Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}
