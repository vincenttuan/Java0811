package com.pcschool.ocp.d15_thread.case1;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account(10000);
        Withdraw w1 = new Withdraw(account, 5000);
        Withdraw w2 = new Withdraw(account, 3000);
        Withdraw w3 = new Withdraw(account, 4000);
        Thread t1 = new Thread(w1, "小明");
        Thread t2 = new Thread(w2, "小英");
        Thread t3 = new Thread(w3, "小華");
        t1.start();
        t2.start();
        t3.start();
    }
}

