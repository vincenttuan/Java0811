package com.pcschool.ocp.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FlatMap {
    public static void main(String[] args) {
        int[][] scores = {
            {100, 90, 80}, 
            {70, 60, 50}
        };
        Arrays.stream(scores)
                .flatMapToInt(s -> Arrays.stream(s));
        Arrays.stream(scores)
                .flatMapToInt(Arrays::stream);
        Arrays.stream(scores)
                .flatMapToInt(s -> IntStream.of(s));
        Arrays.stream(scores)
                .flatMapToInt(IntStream::of);
        //---------------------------------------------
        Arrays.stream(scores)
                .flatMapToInt(s -> Arrays.stream(s))
                .forEach(s -> System.out.println(s));
        
        Arrays.stream(scores)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);
    }
}
