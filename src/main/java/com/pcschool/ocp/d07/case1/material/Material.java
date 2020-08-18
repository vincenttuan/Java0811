package com.pcschool.ocp.d07.case1.material;

public class Material {
    private String name;
    private int price;

    public Material() {
    }

    public Material(String name, int price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}
