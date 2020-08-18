package com.pcschool.ocp.d07.case3;

public class Boss extends Manager {
    public int salary = 100000;
    public void printFire() {
        System.out.println("開除員工");
    }
    public void job() {
        System.out.println("找Case, 發薪水");
    }
}
