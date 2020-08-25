package com.pcschool.ocp.d14_thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo2 {
    public static void main(String[] args) throws Exception {
        // 取得個位數
        Callable<Integer> x = () -> new Random().nextInt(10);
        // 取的十位數
        Callable<Integer> y = () -> new Random().nextInt(9) + 1;
        // 建立 Thread Pool 服務平台
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 執行工作(可以有n個)
        Future<Integer> f1 = service.submit(x);
        Future<Integer> f2 = service.submit(y);
        // 得到結果
        int x_value = f1.get();
        int y_value = f2.get();
        // 列印結果
        System.out.println(y_value * 10 + x_value);
    }
}
