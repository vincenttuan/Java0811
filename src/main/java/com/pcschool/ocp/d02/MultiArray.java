package com.pcschool.ocp.d02;

public class MultiArray {
    public static void main(String[] args) {
        int[][] x = new int[2][3];
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        x[0][0] = 90;
        System.out.println(x[0][0]);
    }
}
