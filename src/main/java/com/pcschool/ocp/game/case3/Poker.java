package com.pcschool.ocp.game.case3;

public class Poker {
    public String mark; // 花色
    public String number; // 號碼
    public String color; // 顏色
    public int    value; // 價值

    public Poker(String mark, String number, String color, int value) {
        this.mark = mark;
        this.number = number;
        this.color = color;
        this.value = value;
    }

}
