package com.pcschool.ocp.d14_thread;

import java.util.Arrays;
import java.util.Random;

public class ThreadDemo {
    public static void main(String[] args) {
        final Random r = new Random();
        // 1~9 取亂數
        Runnable w1 = () -> System.out.println(r.nextInt(9) + 1);        
        // 10~19 取亂數
        Runnable w2 = () -> System.out.println(r.nextInt(10) + 10);
        // 20~29 取亂數
        Runnable w3 = () -> System.out.println(r.nextInt(10) + 20);
        // 30~39 取亂數
        Runnable w4 = () -> System.out.println(r.nextInt(10) + 30);
        
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w3);
        t1.start();
        t2.start();
        
        Runnable[] rs = {w1, w2, w3, w4};
        Arrays.stream(rs).forEach(w -> new Thread(w).start());
        
    }
}
