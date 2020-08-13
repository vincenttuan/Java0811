package com.pcschool.ocp.d03.bookstore;

public class Pen {
    private int price = 10;
    private static int amount = 10;

    public Pen() {
        amount--;
    }
    
    public int getPrice() {
        return price;
    }

    public static int getAmount() {
        return amount;
    }
    
}
