package com.pcschool.ocp.test;

public class Practice1 {
    public static void main(String[] args) {
        int[] x = {10, 20, 30};
        int sum = x[0] + x[1] + x[2];
        System.out.println(sum);
        
        sum = 0;
        sum += x[0];
        sum += x[1];
        sum += x[2];
        System.out.println(sum);
        
        sum = 0;
        for(int i=0;i<x.length;i++) {
            sum += x[i];
        }
        System.out.println(sum);
    }
}
