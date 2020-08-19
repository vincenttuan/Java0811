package com.pcschool.ocp.d08.case4;

public class Student extends Person {
    
    public Student(String name, int age, double bmi) {
        super(name, age, bmi);
    }
    
    public String toString() {
        return String.format("學生: %s 年齡: %d bmi:%.1f\n", getName(), getAge(), getBmi());
    }
    
}
