package com.pcschool.ocp.d07.case1;

import com.pcschool.ocp.d07.case1.food.Food;
import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;

public class Breakfirst3 {
    public static void main(String[] args) {
        Sandwich s1 = new Sandwich("火腿三明治");
        Sandwich s2 = new Sandwich("雞蛋三明治");
        Hamburger h1 = new Hamburger("牛肉蛋堡");
        Hamburger h2 = new Hamburger("大亨堡");
        Food f1 = new Sandwich("三明治");
        Food f2 = new Hamburger("漢堡");
        
        Sandwich[] sandwichs = {s1, s2}; 
        Hamburger[] hamburgers = {h1, h2};
        Food[] foods = {s1, s2, h1, h2, f1, f2};
        
    }
}
