package com.pcschool.ocp.d06.case2;

public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println(manager.getSalary().getMoney());
        
        Sales sales = new Sales();
        System.out.println(sales.getSalary().getMoney());
    }
}
