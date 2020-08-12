package com.pcschool.ocp.game.case1;

import java.util.Random;

public class Number {
    private int ans = new Random().nextInt(10) + 1;
    private int count;
    public int check(int userAns) {
        count++;
        return userAns - ans;
    }
    public int getCount() {
        return count;
    }
}
