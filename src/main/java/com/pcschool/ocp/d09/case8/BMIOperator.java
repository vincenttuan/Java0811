package com.pcschool.ocp.d09.case8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.UnaryOperator;

// Java 8 Function API
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

public class BMIOperator {
    public static void main(String[] args) {
        BiConsumer<Double, Integer> bc = (h, w) -> System.out.println(w / Math.pow(h/100, 2));
        bc.accept(170.0, 60);
        
        BiFunction<Double, Integer, Double> bf  = (h, w) -> w / Math.pow(h/100, 2);
        BiFunction<Double, Integer, Double> bf2 = (h, w) -> h * w;
        double bmi = bf.apply(170.0, 60);
        System.out.println(bmi);
        
        BiFunction<Double, Double, Double> bf3 = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println(bf3.apply(170.0, 60.0));
        
        BinaryOperator<Double> bo = (h, w) -> w / Math.pow(h/100, 2); // BiFunction<Double, Double, Double>
        System.out.println(bo.apply(170.0, 60.0));
        
        // 攝氏轉華氏
        Function<Double, Double> f1 = (c) -> c * (9.0/5) + 32;
        UnaryOperator<Double>    uo = (c) -> c * (9.0/5) + 32; // Function<Double, Double>
        DoubleUnaryOperator      du = (c) -> c * (9.0/5) + 32; // UnaryOperator<Double>
        
        System.out.println(f1.apply(0.0));
        System.out.println(uo.apply(0.0));
        System.out.println(du.applyAsDouble(0.0));
        
        //BinaryOperator<Integer> scoreAvg = (chinese, english) -> (chinese + english)/2;
        //ObjIntConsumer<BinaryOperator<Integer>> oic = (avg, pass) -> System.out.println(avg.apply(pass, pass));
        
    }
}
