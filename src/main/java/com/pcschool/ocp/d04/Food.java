package com.pcschool.ocp.d04;

import java.util.Random;

public class Food {
    private int amount = 100;
    private int price;
    
    // 物件共同初始區段
    {
        int n = new Random().nextInt(10);
        price = n % 2 == 0 ? 100 : 50;
    }
    
    public Food() {
        
    }
    
    public Food(int amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString() {
        return "Food{" + "amount=" + amount + ", price=" + price + '}';
    }
    
}
