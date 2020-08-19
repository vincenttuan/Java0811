package com.pcschool.ocp.d08.army;

public class ArmyMain {
    public static void main(String[] args) {
        Airplane[] airplanes = {new Fighter(), new Fighter(), new Fighter()};
        Car[] cars = {new Tank(), new Truck(), new Truck(), new Tank()};
        Weapon[] weapons = {new Fighter(), new Tank()};
        // cars 要統一發射武器
        for(Car car : cars) {
            if(car instanceof Tank) {
                ((Tank)car).shoot();
            }
        }
        // weapons 要統一發射武器
        for(Weapon w : weapons) {
            w.shoot();
        }
        
        // cars 要統一發射武器 (java 8)
        
        // weapons 要統一發射武器 (java 8)
        
    }
}
