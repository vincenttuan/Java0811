package com.pcschool.ocp.d01;

import java.util.Arrays;

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
        // 取最大值?
        double max = Integer.MIN_VALUE;
        for(int i=0, len=h.length;i<len;i++) {
            if(h[i] > max) {
                max = h[i];
            }
        }
        System.out.printf("最高: %.2f cm\n", max);
        // 取最小值?
        double min = Integer.MAX_VALUE;
        for(int i=0, len=h.length;i<len;i++) {
            if(h[i] < min) {
                min = h[i];
            }
        }
        System.out.printf("最小: %.2f cm\n", min);
        // Java 8
        // 列出所有身高
        Arrays.stream(h).forEach(x -> System.out.println(x));
        // 計算總和與平均
        sum = Arrays.stream(h).sum();
        avg = Arrays.stream(h).average().getAsDouble();
        System.out.printf("總身高: %.1f 平均身高: %.1f\n", sum, avg);
        
    }
 
}
