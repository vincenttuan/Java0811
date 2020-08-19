package com.pcschool.ocp.d08.army;

import java.util.Arrays;

public class ArmyMain {
    public static void main(String[] args) {
        Airplane[] airplanes = {new Fighter(), new Fighter(), new Fighter()};
        Car[] cars = {new Tank(), new Truck(), new Truck(), new Tank()};
        Weapon[] weapons = {new Fighter(), new Tank()};
        System.out.println("--------------");
        // cars 要統一發射武器
        for(Car car : cars) {
            if(car instanceof Tank) {
                ((Tank)car).shoot();
            }
        }
        System.out.println("--------------");
        // weapons 要統一發射武器
        for(Weapon w : weapons) {
            w.shoot();
        }
        System.out.println("--------------");
        // cars 要統一發射武器 (java 8)
        Arrays.stream(cars)
                .filter(c -> c instanceof Weapon)
                .map(c -> (Weapon)c)
                .forEach(c -> c.shoot());
        
        System.out.println("--------------");
        // weapons 要統一發射武器 (java 8)
        Arrays.stream(weapons).forEach(w -> w.shoot());
    }
}
