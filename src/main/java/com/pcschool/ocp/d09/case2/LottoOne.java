package com.pcschool.ocp.d09.case2;

import java.util.Random;

public class LottoOne implements Lotto {

    public void printNumber() {
        Random r = new Random();
        System.out.printf("%d\n", r.nextInt(10));
    }

}
