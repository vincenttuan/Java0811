package com.pcschool.ocp.d08;

public class BallStore {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
