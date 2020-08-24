package com.pcschool.ocp.d11_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "apple", "papaya", "banana");
        System.out.println(items);
        /* 
            分組:
            apple:4, banana:2, orange=1, papaya=1
        */
        System.out.println(
                items.stream()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );
        // {papaya=1, orange=1, banana=2, apple=4}
        Map<String, Long> group1 = items.stream()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println(group1);
        
    }
}
