package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Milk;

public class GreenMilkTea extends GreenTea {

    public GreenMilkTea() {
        Milk milk = new Milk();
        addMaterial(milk);
    }
    
}
