package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Pearl;

public class PearlTea extends MilkTea {

    public PearlTea() {
        Pearl pearl = new Pearl();
        addMaterial(pearl);
    }
 
}
 
