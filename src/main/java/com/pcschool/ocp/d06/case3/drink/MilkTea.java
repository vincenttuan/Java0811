package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Milk;
import com.pcschool.ocp.d06.case3.material.Tea;

public class MilkTea extends Drink {

    public MilkTea() {
        Milk milk = new Milk();
        Tea tea = new Tea();
        addMaterial(milk).addMaterial(tea);
    }
 
}
 
