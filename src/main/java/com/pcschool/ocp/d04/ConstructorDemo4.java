package com.pcschool.ocp.d04;

public class ConstructorDemo4 {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        BMI b2 = new BMI(180, 180);
        BMI b3 = new BMI(60, 170);
        BMI b4 = new BMI(180, 70);
        BMI b5 = new BMI(190); // 身高
        BMI b6 = new BMI(290); // 身高
        
        System.out.println(b1); // 170, 60
        System.out.println(b2); // 180, 60
        System.out.println(b3); // 170, 60
        System.out.println(b4); // 180, 70
        System.out.println(b5); // 190, 60
        System.out.println(b6); // 170, 60
    }
}
