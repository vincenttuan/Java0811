package com.pcschool.ocp.d09.case7;

public class CalcMain {
    public static void main(String[] args) {
        Calc<Integer> c = new Calc<Integer>() {
            @Override
            public void add(Integer t) {
                System.out.println(t + t);
            }
        };
        c.add(10);
        Calc<String> c2 = new Calc<String>() {
            @Override
            public void add(String t) {
                System.out.println(t + t);
            }
        };
        c2.add("10");
        // Lambda
        Calc<Integer> c3 = (t) -> System.out.println(t + t);
        Calc<String> c4 = (t) -> System.out.println(t + t);
        c3.add(10);
        c4.add("10");
    }
}
