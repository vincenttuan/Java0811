package com.pcschool.ocp.d11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MapDemo5 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(100, 90, 50, 70, 40);
        // 及格與不及格各有幾人 ?
        // true: 3, false:2
        System.out.println(
                scores.stream()
                    .collect(groupingBy(n -> n >= 60, counting()))
        );
        System.out.println(
                scores.stream()
                    .collect(groupingBy(n -> n >= 60?"及格":"不及格", counting()))
        );
    }
}
