package com.pcschool.ocp.d01;

// 物件參考應用練習
public class ReferenceTest {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = s1;
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "Hello";
        append(s3);
    }
    
    public static void append(String s) { // 相當於 s = s3
        s = s + "Java";
        System.out.println(s);
    }
}
