package com.pcschool.ocp.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class FlatMap2 {

    public static void main(String[] args) {
        String[][] names = {
            {"John", "Marry"},
            {"Java", "Python", "VB"},
            {"Android", "iPhone"},};
        
        IntSummaryStatistics stat = null;
        
        stat = Arrays.stream(names)
                .flatMap(s -> Stream.of(s))
                .mapToInt(s -> s.length())
                .summaryStatistics();
        
        stat = Arrays.stream(names)
                .flatMap(Stream::of)
                .mapToInt(String::length)
                .summaryStatistics();
        

        // 請問總共有幾個字母 ?
        System.out.println(stat.getSum());
        // 長度最長的是幾個字 ?
        System.out.println(stat.getMax());
        // 長度最短的是幾個字 ?
        System.out.println(stat.getMin());
    }

}
