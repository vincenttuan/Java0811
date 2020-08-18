package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Beef;
import com.pcschool.ocp.d07.case1.material.Egg;
import com.pcschool.ocp.d07.case1.material.Material;

public class Hamburger extends Food {

    public Hamburger(String name) {
        super(name);
        // 定義食材
        Material[] materials = new Material[2];
        materials[0] = new Beef();
        materials[1] = new Egg();
        setMaterials(materials);
    }
 
}
 
