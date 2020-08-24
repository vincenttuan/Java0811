package com.pcschool.ocp.d11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("英文", 100);
        exams.put("數學", 90);
        System.out.println(exams + "\n");
        // 走訪元素 1
        System.out.println(exams.get("國文"));
        System.out.println(exams.get("英文"));
        System.out.println(exams.get("數學") + "\n");
        // 走訪元素 2
        Set<String> keys = exams.keySet();
        for(String key : keys) {
            System.out.println(key + ":" + exams.get(key));
        }
        System.out.println();
        // 走訪元素 3
        Set<Entry<String, Integer>> entrySet =  exams.entrySet();
        for(Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println();
    }
}

