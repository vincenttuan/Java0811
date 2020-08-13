package com.pcschool.ocp.d03.school;

public class BMI {
    private double height;
    private double weight;
    private double bmiValue;

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.bmiValue = weight / Math.pow(height/100, 2);
    }

    @Override
    public String toString() {
        return "BMI{" + "height=" + height + ", weight=" + weight + ", bmiValue=" + bmiValue + '}';
    }
    
}
