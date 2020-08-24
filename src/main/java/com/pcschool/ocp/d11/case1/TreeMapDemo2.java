package com.pcschool.ocp.d11.case1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        Map<Level, String> scores = new TreeMap<>();
        scores.put(new Level(90, "A"), "John");
        scores.put(new Level(70, "C"), "Mary");
        scores.put(new Level(80, "C"), "Helen");
        System.out.println(scores);
    }
}
