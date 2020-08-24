package com.pcschool.ocp.d11.case1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(90, "A");
        map.put(70, "C");
        map.put(80, "B");
        System.out.println(map);
    }
}
