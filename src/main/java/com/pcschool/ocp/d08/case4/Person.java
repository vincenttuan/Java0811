package com.pcschool.ocp.d08.case4;

public abstract class Person {
    private String name;
    private int age;
    private double bmi;

    public Person(String name, int age, double bmi) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
    }

    public String getName() {
        return null;
    }

    public int getAge() {
        return 0;
    }

    public double getBmi() {
        return 0;
    }

    public abstract String toString();
}
