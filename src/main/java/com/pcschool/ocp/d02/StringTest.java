package com.pcschool.ocp.d02;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("jAVA");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
