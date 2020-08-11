package com.pcschool.ocp.d01;

public class ArrayTest3 {
    public static void main(String[] args) {
        double[] h = {172, 168, 164, 170, 176};
        // Java 7
        double avg = 0;
        double sum = 0;
        for(int i=0, len=h.length;i<len;i++) {
            sum += h[i];
        }
        avg = sum/h.length;
        System.out.printf("平均: %.2f cm\n", avg);
        
        // Java 8
        
    }
 
}
