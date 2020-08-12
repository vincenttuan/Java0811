package com.pcschool.ocp.d02;

public class StringTest4 {
    public static void main(String[] args) {
        String s = "Java";
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(s);
        System.out.println(sb);
        updateString(s);
        updateStringBuilder(sb);
        System.out.println(s);
        System.out.println(sb);
    }
    
    public static void updateString(String s) {
        s = s.concat("8");
    }
    
    public static void updateStringBuilder(StringBuilder sb) {
        sb.append("8");
    }
    
}
