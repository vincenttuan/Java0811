package com.pcschool.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArithmeticMethod2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] scores = new int[10];
        for(int i=0;i<scores.length;i++) {
            scores[i] = r.nextInt(100);
        }
        // Java 8
        Arrays.stream(scores).forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.stream(scores).sorted().forEach(s -> System.out.print(s + " "));
        
    }
}
