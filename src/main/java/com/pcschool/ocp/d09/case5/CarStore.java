package com.pcschool.ocp.d09.case5;

public class CarStore {
    public static void main(String[] args) {
        Motor m1 = new Car();
        Motor m2 = Car::new ;
        m1.speed();
        m2.speed();
    }
}
