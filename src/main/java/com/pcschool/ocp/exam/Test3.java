package com.pcschool.ocp.exam;

public class Test3 {
    StringBuilder s;
    public Test3(StringBuilder s) {
        this.s = s.append("8");
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Java");
        Test3 t2 = new Test3(s);
        System.out.println(s);
        System.out.println(t2.s);
    }
}
