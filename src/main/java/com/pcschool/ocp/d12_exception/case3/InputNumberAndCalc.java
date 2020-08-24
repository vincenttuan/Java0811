package com.pcschool.ocp.d12_exception.case3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberAndCalc {

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        System.out.printf("請輸入分母: ");
        Scanner sc = new Scanner(System.in);
        try {
            int d = sc.nextInt();
            int result = calc(d);
            print(result);
        } catch (InputMismatchException e) {
            System.out.println("輸入錯誤, 請重新輸入 !");
            input();
        } catch (ArithmeticException e2) {
            System.out.println("發生了數學錯誤, 分母不可為 0, 請重新輸入 !");
            input();
        }

    }

    public static int calc(int denominator) { // denominator 分母
        int result = 100 / denominator;
        return result;
    }

    public static void print(int result) {
        System.out.printf("result = %d\n", result);
    }
}
