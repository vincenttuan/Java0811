package com.pcschool.ocp.d04;

public class Pen {
    private int price;

    public Pen(int price) {
        if(price < 10)
            this.price = 10;
        else
            this.price = price;
    }

    public Pen() {
        this(5);
    }

    @Override
    public String toString() {
        return "Pen{" + "price=" + price + '}';
    }
    
}
