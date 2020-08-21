package com.pcschool.ocp.d10.case5;

import java.util.Set;
import java.util.TreeSet;

public class DrinkStore {
    public static void main(String[] args) {
        Drink coffee = new Drink("咖啡", 100);
        Drink tea = new Drink("紅茶", 50);
        Drink milk = new Drink("牛奶", 70);
        
        Set<Drink> drinks = new TreeSet<>();
        drinks.add(coffee);
        drinks.add(tea);
        drinks.add(milk);
        System.out.println(drinks);
        
    }
}
