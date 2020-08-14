package com.pcschool.ocp.d04;

public class Car {
    private static String brandName = "Toyota"; // 車商
    private String typeName = "Altis"; // 車款
    
    public void printCar() {
        System.out.println(brandName);
        System.out.println(typeName);
    }
    
    public static void printCar2() {
        System.out.println(brandName);
    }
    
    public static void printCar3() {
        System.out.println(brandName);
        Car car = new Car();
        System.out.println(car.typeName);
    }
}
