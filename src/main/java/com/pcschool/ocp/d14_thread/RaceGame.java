package com.pcschool.ocp.d14_thread;

public class RaceGame {
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 舉辦了龜兔賽跑的比賽\n", tName);
        Race r1 = new Race("烏龜");
        Race r2 = new Race("兔子");
        r1.start();
        r2.start();
    }
}
