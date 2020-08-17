package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Pearl;

public class GreenPearlTea extends GreenMilkTea {

    public GreenPearlTea() {
        Pearl pearl = new Pearl("S");
        addMaterial(pearl);
    }
    
}
