package com.pcschool.ocp.exam;

public class Test {
    int x, y;

    public Test(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }
    
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        Test t = new Test(x, y);
        System.out.println(x + ", " + y);
        System.out.println(t.x + ", " + t.y);
    }
    
}
