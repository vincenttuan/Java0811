package com.pcschool.ocp.d03.carstore;

public class ToyStore {
    public static void main(String[] args) {
        // 準備素材
        Engine engine = new Engine();
        Tire[] tires = {new Tire(), new Tire(),new Tire(), new Tire()};
        Wheel wheel = new Wheel();
        // 組合
        ToyCar toyCar = new ToyCar();
        toyCar.engine = engine;
        toyCar.tires = tires;
        toyCar.wheel = wheel;
    }
}
