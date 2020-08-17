package com.pcschool.ocp.d06.case2.salary;

public class Salary {
    private static final int BASE_MONEY = 23800;
    private int money = BASE_MONEY;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money < BASE_MONEY) {
            money = BASE_MONEY;
        } else {
            this.money = money;
        }
    }

}
