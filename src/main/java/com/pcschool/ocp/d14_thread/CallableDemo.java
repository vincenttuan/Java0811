package com.pcschool.ocp.d14_thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws Exception {
        // 取得個位數
        Callable<Integer> x = () -> new Random().nextInt(10);
        // 取的十位數
        Callable<Integer> y = () -> new Random().nextInt(9) + 1;
        
        FutureTask<Integer> task1 = new FutureTask<>(x);
        FutureTask<Integer> task2 = new FutureTask<>(y);
        new Thread(task1).start();
        new Thread(task2).start();
        int x_value = task1.get();
        int y_value = task2.get();
        
        // 得到 (十位數 * 10 + 個位數)
        System.out.println(y_value * 10 + x_value);
    }
}
