package com.pcschool.ocp.d04;

public class ConstructorDemo5 {
    public static void main(String[] args) {
        Food f1 = new Food();
        Food f2 = new Food(300);
        System.out.println(Food.name);
        System.out.println(f1);
        System.out.println(f2);
    }
}
