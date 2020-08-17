package com.pcschool.ocp.d06.case3.drink;

import com.pcschool.ocp.d06.case3.material.Material;
import java.util.ArrayList;

public class Drink {

    private ArrayList<Material> materials; // ArrayList 動態陣列宣告
    private int price;

    public Drink() {
        materials = new ArrayList<>(); // ArrayList 動態陣列實體
    }
    
    public Drink addMaterial(Material m) { // 增加原料
        materials.add(m);
        return this;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }
    
    public int getPrice() {
        return materials.stream().mapToInt(m -> m.getPrice()).sum();
    }
    
    
    
}
