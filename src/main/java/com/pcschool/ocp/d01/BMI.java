package com.pcschool.ocp.d01;

public class BMI {
    public String name;
    public double h;
    public double w;
    public double bmi;
    
    // 計算 BMI 的方法
    public double calcBMI() {
        bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
}
