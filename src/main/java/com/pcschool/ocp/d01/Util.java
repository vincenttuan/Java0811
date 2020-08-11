package com.pcschool.ocp.d01;

public class Util {
    public double [] values;
    public double getSum() {
        int sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += values[i];
        }
        return sum;
    }
    public double getAvg() {
        return getSum() / values.length;
    }
    public double getSD() {
        double avg = getAvg();
        double sum = 0;
        for(int i=0;i<values.length;i++) {
            sum += Math.pow(values[i] - avg, 2);
        }
        double sd = Math.sqrt((1.0/values.length)*sum);
        return sd;
    }
    public double getCV() {
        double cv = getSD() / getAvg();
        return cv;
    }
}
