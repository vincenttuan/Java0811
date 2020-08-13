package com.pcschool.ocp.d03;

public class ArithmeticMethod3 {
    public static void main(String[] args) {
        BMI[] bmis = {new BMI(170.0, 60.0), new BMI(160.0, 60.5), new BMI(185, 65.5)};
        
    }
}

class BMI {
    private double h;
    private double w;
    private double value;

    public BMI(double h, double w) {
        this.h = h;
        this.w = w;
        value = w / Math.pow(h/100, 2);
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + ", value=" + value + '}';
    }
    
}
