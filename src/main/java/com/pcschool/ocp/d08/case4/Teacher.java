package com.pcschool.ocp.d08.case4;

public class Teacher extends Person {
    
    private Salary salary;
    
    public Teacher(String name, int age, double bmi, int money) {
        super(name, age, bmi);
        this.salary = new Salary(money);
    }
    
    public Salary getSalary() {
        return salary;
    }
    
    public String toString() {
        return String.format("老師: %s 年齡: %d bmi:%.1f 薪資: %d", getName(), getAge(), getBmi(), salary.getMoney());
    }
    
}
