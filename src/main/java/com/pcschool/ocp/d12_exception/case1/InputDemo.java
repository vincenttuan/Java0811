package com.pcschool.ocp.d12_exception.case1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        input();
    }
    
    public static void input() {
        System.out.print("請輸入一個數字: ");
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            System.out.printf("x= %d %s\n", x, x % 2 == 0?"偶數":"奇數");
        } catch (InputMismatchException e) {
            System.out.println("您輸入的不是數字, 請重新輸入~~");
            System.out.printf("輸入錯誤, 錯誤原因: %s\n", e.getMessage());
            System.out.println(e); // 錯誤訊息(短)
            e.printStackTrace(System.out); // 錯誤訊息(完整)
        } finally {
            input();
        }
        
    }
}
