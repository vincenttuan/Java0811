package com.pcschool.ocp.d14_thread;

public class WalkGame {
    public static void main(String[] args) {
        Runnable r1 = new Walk(); // 執行緒要做的工作
        Runnable r2 = new Walk(); // 執行緒要做的工作
        Runnable r3 = new Walk(); // 執行緒要做的工作
        Runnable r4 = new Walk(); // 執行緒要做的工作
        Thread t1 = new Thread(r1, "烏龜"); // 建立執行緒並執行相對應的工作
        Thread t2 = new Thread(r2, "兔子");
        t1.start();
        t2.start();
    }
}
