package com.pcschool.ocp.d03.carstore;

public class ToyCar {
    Wheel wheel;
    Tire[] tires;
    Engine engine;
    private int price;
    public int getPrice() {
        // 加總每一個輪胎的價格
        int tiresTotalPrice = 0;
        for(Tire tire : tires) {
            tiresTotalPrice += tire.price;
        }
        // 所有價格加起來
        return wheel.price + engine.price + tiresTotalPrice;
    }
}
