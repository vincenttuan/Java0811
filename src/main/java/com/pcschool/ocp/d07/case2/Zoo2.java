package com.pcschool.ocp.d07.case2;

public class Zoo2 {
    public static void main(String[] args) {
        Animal animal1 = new Fish();
        Animal animal2 = new Pengiun();
        if(animal1 instanceof Bird) {
            ((Bird)animal1).move();
        } else {
            System.out.println("Fish 不可轉成 Bird");
        }
        ((Bird)animal2).move();
    }
}
