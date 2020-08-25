package com.pcschool.ocp.d15_thread.case1;

// 提款的工作
public class Withdraw implements Runnable {
    private Account account;
    private int money;

    public Withdraw(Account account, int money) {
        this.account = account;
        this.money = money;
    }
    
    @Override
    public void run() {
        account.withdraw(money);
    }
    
}
