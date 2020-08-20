package com.pcschool.ocp.d09.case9;

public enum Salary {
    Operator(23000),
    Programmer(45000),
    Manager(75000),
    Boss(1);
    
    private int money;

    private Salary(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    
}
