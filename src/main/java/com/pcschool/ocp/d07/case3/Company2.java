package com.pcschool.ocp.d07.case3;

public class Company2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Boss();
        System.out.println(emp1.salary);
        System.out.println(emp2.salary);
    }
}
