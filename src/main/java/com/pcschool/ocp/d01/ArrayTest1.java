package com.pcschool.ocp.d01;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = {100, 90, 83, 70};
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores.length);
        // 求總分 ?
        int sum = 0;
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        System.out.printf("總分: %d\n", sum);
        // 求平均 ?
        double avg = sum / (double)scores.length;
        System.out.printf("平均: %.1f\n", avg);
        // 標準差
        double sum2 = 0;
        for(int i=0;i<scores.length;i++) {
            sum2 += Math.pow(scores[i] - avg, 2);
        }
        double sd = Math.sqrt((1.0/scores.length)*sum2);
        System.out.printf("標準差: %.2f\n", sd);
        // 變異係數
        double cv = sd / avg;
        System.out.printf("變異係數: %.2f\n", cv);
    }
}
