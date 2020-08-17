package com.pcschool.ocp.d06.case1;

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.getSalary());
        
        Manager manager = new Manager();
        manager.setSalary(50000);
        System.out.println(manager.getSalary());
        
        Manager manager2 = new Manager();
        System.out.println(manager2.getSalary());
    }
}
