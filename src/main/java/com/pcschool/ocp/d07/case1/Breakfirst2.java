package com.pcschool.ocp.d07.case1;

import com.pcschool.ocp.d07.case1.food.Food;
import com.pcschool.ocp.d07.case1.food.Hamburger;
import com.pcschool.ocp.d07.case1.food.Sandwich;
import java.util.Arrays;

public class Breakfirst2 {
    public static void main(String[] args) {
        Food[] foods = {new Sandwich("火腿蛋"), new Sandwich("火腿蛋"), new Hamburger("牛肉蛋堡")};
        // 請問我要付多少錢 ?
        // Java 7
        int sum = 0;
        for(Food food : foods) {
            sum += food.getPrice();
        }
        System.out.println(sum);
        // Java 8
        sum = Arrays.stream(foods).mapToInt(f -> f.getPrice()).sum();
        System.out.println(sum);
    }
}
