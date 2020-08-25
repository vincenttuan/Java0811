package com.pcschool.ocp.d14_thread;

public class RaceGame {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 舉辦了龜兔賽跑的比賽\n", tName);
        Race r1 = new Race("烏龜");
        Race r2 = new Race("兔子");
        r1.setPriority(Thread.MAX_PRIORITY); // 1~10
        r2.setPriority(Thread.MIN_PRIORITY); // 1~10
        // 參與人員(有幾條執行緒在運行)
        int count = Thread.activeCount();
        System.out.printf("參與人員: %d\n", count);
        r1.start();
        r2.start();
        // 參與人員(有幾條執行緒在運行)
        int count2 = Thread.activeCount();
        System.out.printf("參與人員: %d\n", count2);
        
    }
}
