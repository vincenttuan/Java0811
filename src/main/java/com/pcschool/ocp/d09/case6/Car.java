package com.pcschool.ocp.d09.case6;

public class Car {
    private String name;
    
    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + '}';
    }
}
