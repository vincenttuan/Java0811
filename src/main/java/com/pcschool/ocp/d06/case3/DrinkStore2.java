package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.Coffee;
import com.pcschool.ocp.d06.case3.drink.Drink;
import com.pcschool.ocp.d06.case3.drink.GreenPearlTea;
import com.pcschool.ocp.d06.case3.drink.GreenTea;
import com.pcschool.ocp.d06.case3.drink.MilkTea;
import com.pcschool.ocp.d06.case3.drink.PearlTea;
import java.util.ArrayList;

public class DrinkStore2 {
    public static void main(String[] args) {
        // 建立一個只能放 Drink 物件的動態陣列
        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Coffee()); // add() 加入元素
        drinks.add(new GreenTea());
        drinks.add(new GreenTea());
        drinks.add(new GreenPearlTea());
        drinks.add(new GreenPearlTea());
        drinks.add(new GreenPearlTea());
        drinks.add(new MilkTea());
        drinks.add(new MilkTea());
        drinks.add(new MilkTea());
        drinks.add(new MilkTea());
        drinks.add(new PearlTea());
        drinks.add(new PearlTea());
        drinks.add(new PearlTea());
        drinks.add(new PearlTea());
        drinks.add(new PearlTea());
        
        // 總共買了多少錢 ?
        int sum = 
        
    }
}
