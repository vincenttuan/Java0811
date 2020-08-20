package com.pcschool.ocp.d09.case8;

import java.util.Arrays;
import java.util.function.Supplier;

public class CycleArea {
    public static void main(String[] args) {
        Supplier<Double> pi = () -> Math.PI; // Supplier
        
        int[] rs = {5, 10, 15, -4, 20, 0, -25};
        Arrays.stream(rs)
                .filter((r) -> r > 0) // Predicate 得到 [5, 10, 15, 20]
                .mapToDouble((r) -> r * r * pi.get()) // Function
                .forEach(area -> System.out.println(area)); // Consumer
        
                
                
                
        
    }
}
