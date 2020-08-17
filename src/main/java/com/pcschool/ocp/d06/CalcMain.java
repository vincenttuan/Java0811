package com.pcschool.ocp.d06;

public class CalcMain {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int[] values = {10, 20, 30};
        int sum = calc.add(values);
        System.out.println(sum);
        
        sum = calc.add(10, 20);
        System.out.println(sum);
        
        sum = calc.add(10, 20, -10, 70, -50);
        System.out.println(sum);
        
        sum = calc.add(10);
        System.out.println(sum);
        
        sum = calc.add();
        System.out.println(sum);
        
    }
}
