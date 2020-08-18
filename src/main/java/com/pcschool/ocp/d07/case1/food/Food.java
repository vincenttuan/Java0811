package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Material;
import java.util.Arrays;

public class Food {

    private String name;

    private Material[] materials;

    public Food() {
    }

    public Food(String name) {
        setName(name);
    }

    public int getPrice() {
        return Arrays.stream(materials).mapToInt(m -> m.getPrice()).sum();
    }

    public Food addMaterial(Material material) {
        Material[] new_materials = new Material[materials.length + 1];
        /*
        for(int i=0;i<new_materials.length-1;i++) {
            new_materials[i] = materials[i];
        }
        */
        // 來源陣列 src, 來源陣列起始位置 srcPos, 目的陣列 dest, 目的陣列起始位置 destPos, 資料長度 length
        System.arraycopy(materials, 0, new_materials, 0, materials.length);
        new_materials[new_materials.length-1] = material;
        setMaterials(new_materials);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

}
