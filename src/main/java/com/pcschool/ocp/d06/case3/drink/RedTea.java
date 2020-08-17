package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Tea;

public class RedTea extends Drink {

    public RedTea() {
        Tea tea = new Tea();
        addMaterial(tea);
    }
 
}
 
