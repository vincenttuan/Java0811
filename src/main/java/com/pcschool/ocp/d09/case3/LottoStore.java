package com.pcschool.ocp.d09.case3;

import java.util.Random;

public class LottoStore {
    public static void main(String[] args) {
        Lotto one = new Lotto(){
            @Override
            public void printNumber() {
                Random r = new Random();
                System.out.printf("%d\n", r.nextInt(10));
            }
        };
        one.printNumber();
    }
}
