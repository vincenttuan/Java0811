package com.pcschool.ocp.d07.case2;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Animal animal2 = new Bird();
        animal2.move();
        Animal animal3 = new Fish();
        animal3.move();
        Animal animal4 = new Pengiun();
        animal4.move();
        System.out.println("-------------------------");
        Bird bird = new Bird();
        bird.move();
        Bird bird2 = new Pengiun();
        bird2.move();
        ((Pengiun)bird2).skill();
    }
}
