package com.pcschool.ocp.d14_thread;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {

    private CyclicBarrier cb;

    public Car(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            String tName = Thread.currentThread().getName();
            System.out.printf("%s 從台北出發了\n", tName);
            Thread.sleep(new Random().nextInt(5000));
            System.out.printf("%s 到台中了\n", tName);
            cb.await(); // 等待其他執行緒
            System.out.printf("%s 往高雄出發\n", tName);
        } catch (Exception e) {
        }
    }

}
