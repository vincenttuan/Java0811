package com.pcschool.ocp.d03.bookstore;

public class Store {
    public static void main(String[] args) {
        Pen[] pens = new Pen[4];
        for(int i=0;i<pens.length;i++) {
            pens[i] = new Pen();
        }
        int sum = 0;
        for(Pen pen : pens) {
            sum += pen.getPrice();
        }
        System.out.println(sum);
        System.out.println("剩下: " + Pen.getAmount());
    }
}
