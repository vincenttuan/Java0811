package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Tea;

public class GreenTea extends Drink {

    public GreenTea() {
        Tea tea = new Tea("綠茶", 25);
        addMaterial(tea);
    }
    
}
