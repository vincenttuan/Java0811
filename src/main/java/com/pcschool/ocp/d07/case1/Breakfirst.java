package com.pcschool.ocp.d07.case1;

import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;
import com.pcschool.ocp.d07.case1.material.Hotdog;
import com.pcschool.ocp.d07.case1.material.Pork;

public class Breakfirst {
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("火腿蛋三明治");
        sandwich.addMaterial(new Hotdog()).addMaterial(new Pork()); // 增加 Hotdog, Pork
        System.out.println(sandwich.getName()); // 火腿蛋三明治
        System.out.println(sandwich.getPrice()); // 25
        
        Hamburger hamburger = new Hamburger("牛肉蛋堡");
        System.out.println(hamburger.getName()); // 牛肉蛋堡
        System.out.println(hamburger.getPrice()); // 50
        
    }
}
