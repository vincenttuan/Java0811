package com.pcschool.ocp.d06.case1;

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getSalary());
        Manager manager = new Manager();
        System.out.println(manager.getSalary());
    }
}
