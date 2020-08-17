package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Milk;
import com.pcschool.ocp.d06.case3.material.Pearl;
import com.pcschool.ocp.d06.case3.material.Tea;

public class PearlTea extends Drink {

    public PearlTea() {
        Milk milk = new Milk();
        Tea tea = new Tea();
        Pearl pearl = new Pearl();
        addMaterial(milk).addMaterial(tea).addMaterial(pearl);
    }
 
}
 
