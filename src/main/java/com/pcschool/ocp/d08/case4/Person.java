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
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBmi() {
        return bmi;
    }

    public abstract String toString();
}
