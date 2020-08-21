package com.pcschool.ocp.d10.case3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Set 集合容器
        Set s1 = new HashSet();
        s1.add(100); // Integer
        s1.add(90);
        s1.add(80);
        System.out.println(s1);
        Set s2 = new LinkedHashSet();
        s2.add(100);
        s2.add(90);
        s2.add(80);
        System.out.println(s2);
        Set s3 = new TreeSet();
        s3.add(100);
        s3.add(90);
        s3.add(80);
        System.out.println(s3);
    }
}
