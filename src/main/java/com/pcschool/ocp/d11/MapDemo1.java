package com.pcschool.ocp.d11_map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Set<String> subject = new LinkedHashSet<>();
        subject.add("國文");
        subject.add("英文");
        subject.add("數學");
        List<Integer> scores = new LinkedList<>();
        scores.add(100);
        scores.add(100);
        scores.add(90);
        System.out.println(subject + ", " + scores);
        //---------------------------------------------
        Map<String, Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("英文", 100);
        exams.put("數學", 90);
        System.out.println(exams);
        System.out.println(exams.get("國文"));
        System.out.println(exams.get("自然"));
        //---------------------------------------------
        Set<String> keys = exams.keySet();
        System.out.println(keys);
        List<Integer> values = new LinkedList(exams.values());
        System.out.println(values);
    }
}
