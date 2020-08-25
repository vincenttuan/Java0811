package com.pcschool.ocp.d13_assert;

public class Square {
    // 梯形面積
    public int getArea(int x, int y, int h) {
        int area = (x + y) * h / 2;
        return area;
    }
    // 三梯形面積
    public int getTriangle(int x, int h) {
        int area = x * h / 2;
        return area;
    }
}
