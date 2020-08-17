package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Milk;

public class MilkTea extends RedTea {

    public MilkTea() {
        Milk milk = new Milk();
        addMaterial(milk);
    }
 
}
 
