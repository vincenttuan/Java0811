package com.pcschool.ocp.d15_thread.case1;

public class Account {
    private int balance; // 帳戶餘額(與執行緒共享)

    public Account(int balance) {
        this.balance = balance;
    }
    
    // 提款方法
    public void withdraw(int money) { // money 是一個方法區域變數(每一個執行緒自己會擁有一個)
        String tName = Thread.currentThread().getName();
        System.out.printf("%s 進行提款\n", tName);
        // 檢查目前的帳戶餘額
        int current_balance = balance;
        // 進行假提領
        current_balance = current_balance - money;
        // 進行提款程序
        if(current_balance >=0) { // 餘額充足, 可以提領...
            balance = current_balance; // 將最新餘額寫入 balance
            System.out.printf("%s 提款: $d 成功, 帳戶餘額: %d\n", tName, money, balance);
        } else {
            System.out.printf("%s 提款: $d 失敗, 帳戶餘額: %d\n", tName, money, balance);
        }
    }
    
}
