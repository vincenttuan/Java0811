package com.pcschool.ocp.d03.school;

public class BMI {
    private double height;
    private double weight;
    private double bmiValue;

    public BMI(double height, double weight, double bmiValue) {
        this.height = height;
        this.weight = weight;
        this.bmiValue = bmiValue;
    }

    @Override
    public String toString() {
        return "BMI{" + "height=" + height + ", weight=" + weight + ", bmiValue=" + bmiValue + '}';
    }
    
}
