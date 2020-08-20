package com.pcschool.ocp.d09.case1;

public class MyOuter {
    static int x = 200;
    int y = 100;
    // 一般內部類別
    class MyInner {
        public void print() {
            System.out.println("Print MyInner: " + MyOuter.this.y + ", " + MyOuter.x);
            MyStaticInner.print(); // 一般內部類別成員可以呼叫到靜態內部類別成員
        }
    }
    // 靜態內部類別
    static class MyStaticInner {
        public static void print() {
            System.out.println("Print MyStaticInner: " + MyOuter.x);
        }
    }
    
}
