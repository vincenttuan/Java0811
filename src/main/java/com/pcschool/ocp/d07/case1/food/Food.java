package com.pcschool.ocp.d07.case1.food;

import com.pcschool.ocp.d07.case1.material.Material;

public class Food {

    private String name;

    private Material[] materials;

    public Food() {
    }

    public Food(String name) {
    }

    public int getPrice() {
        return 0;
    }

    public Food addMaterial(Material material) {
        return null;
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
