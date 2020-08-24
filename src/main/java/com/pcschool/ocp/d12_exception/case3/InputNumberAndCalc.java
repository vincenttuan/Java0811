package com.pcschool.ocp.d12_exception.case3;

import java.util.Scanner;

public class InputNumberAndCalc {
    public static void main(String[] args) {
        
    }
    
    public static void input() {
        System.out.printf("請輸入分母: ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int result = calc(d);
        print(result);
    }
    
    public static int calc(int denominator) { // denominator 分母
        int result = 100/denominator;
        return result;
    }
    
    public static void print(int result) {
        System.out.printf("result = %d\n", result);
    }
}
