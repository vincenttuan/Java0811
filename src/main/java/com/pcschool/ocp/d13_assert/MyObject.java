package com.pcschool.ocp.d13_assert;

public class MyObject {
    
    public MyObject() {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " 執行建構子");
    }

    @Override
    protected void finalize() throws Throwable {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " 執行 finalize 方法, freeMemory: " + Runtime.getRuntime().freeMemory());
    }
    
    public static void main(String[] args) {
        String tName = Thread.currentThread().getName();
        System.out.println(tName + " 執行 main 方法, freeMemory: " + Runtime.getRuntime().freeMemory());
        MyObject mo = new MyObject();
        mo = null;
        System.gc();
    }
    
    
}
