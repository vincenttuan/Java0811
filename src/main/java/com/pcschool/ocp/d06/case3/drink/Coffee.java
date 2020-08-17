package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Bean;
import com.pcschool.ocp.d06.case3.material.Milk;

public class Coffee extends Drink {

    public Coffee() {
        // 組合飲料原料
        Bean bean = new Bean();
        Milk milk = new Milk();
        addMaterial(bean).addMaterial(milk);
    }
 
}
 
