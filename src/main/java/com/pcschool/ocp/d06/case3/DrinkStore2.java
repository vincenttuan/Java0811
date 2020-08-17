package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.Coffee;
import com.pcschool.ocp.d06.case3.drink.Drink;
import com.pcschool.ocp.d06.case3.drink.GreenPearlTea;
import com.pcschool.ocp.d06.case3.drink.GreenTea;
import com.pcschool.ocp.d06.case3.drink.MilkTea;
import com.pcschool.ocp.d06.case3.drink.PearlTea;
import com.pcschool.ocp.d06.case3.material.Milk;
import com.pcschool.ocp.d06.case3.material.Pearl;
import com.pcschool.ocp.d06.case3.material.Tea;
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
        
        // 1.總共買了多少錢 ?
        int sum = drinks.stream().mapToInt(d -> d.getPrice()).sum();
        System.out.printf("總共買了多少錢: $%,d\n", sum);
        
        // 2.成分中有奶製品(Milk)的共有多少錢 ?
        sum = drinks.stream()
                .filter(d -> d instanceof MilkTea || d instanceof Coffee || d instanceof PearlTea || d instanceof GreenPearlTea )
                .mapToInt(d -> d.getPrice()).sum();
        System.out.printf("有奶製品(Milk)總共買了多少錢: $%,d\n", sum);        
        
        // 改良
        sum = drinks.stream()
                .filter(d -> d.getMaterials().stream().filter(m -> m instanceof Milk).findAny().isPresent())
                .mapToInt(d -> d.getPrice()).sum();
        System.out.printf("有奶製品(Milk)總共買了多少錢: $%,d\n", sum);        
    }
}
