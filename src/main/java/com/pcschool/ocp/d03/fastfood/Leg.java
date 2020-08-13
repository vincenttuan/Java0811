package com.pcschool.ocp.d03.fastfood;

public class Leg {
    private int price = 45;
    private static int amount = 100;

    public Leg() {
        amount--;
    }
    
    public int getPrice() {
        return price;
    }
    public static int getAmount() {
        return amount;
    }
}
