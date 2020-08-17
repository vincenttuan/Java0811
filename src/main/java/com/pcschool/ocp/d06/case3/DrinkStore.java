package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.GreenPearlTea;
import com.pcschool.ocp.d06.case3.drink.PearlTea;

public class DrinkStore {
    public static void main(String[] args) {
        PearlTea pearlTea = new PearlTea();
        System.out.println(pearlTea.getPrice());
        
        GreenPearlTea greenPearlTea = new GreenPearlTea();
        System.out.println(greenPearlTea.getPrice());
        System.out.println("成分: ");
        greenPearlTea.getMaterials()
                .stream()
                .forEach(m -> {
                    System.out.println(m.getName() + " $" + m.getPrice());
                });
    }
}
