package com.pcschool.ocp.d07.case3;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Manager();
        Employee emp3 = new Boss();
        canBudget(emp3);
    }
    
    // 誰可以編預算 ?
    public static void canBudget(Employee emp) {
        if(emp instanceof Manager) {
            ((Manager)emp).printBudget();
        } else {
            System.out.println("此員工無權編預算");
        }
    }
}
