package com.pcschool.ocp.d03;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {18, 17, 17, 16};
        for(int k=1;k<x.length;k++) {
            for(int i=0;i<x.length-k;i++) {
                int a = x[i];
                int b = x[i+1];
                if(x[i] > x[i+1]) {
                    x[i] = b;
                    x[i+1] = a;
                }
            }
        }
        for(int num : x) {
            System.out.print(num + " ");
        }
    }
}
