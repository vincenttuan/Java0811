package com.pcschool.ocp.d05;

class Animal {
    public Animal(int legs) {
        System.out.println("執行 Animal 建構子");
        System.out.printf("有 %d 隻腳\n", legs);
    }
}

class Dog extends Animal {
    public Dog(int legs) {
        super(legs);
        System.out.println("執行 Dog 建構子");
    }
    public Dog() {
        this(4);
        System.out.println("執行 Dog 建構子");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog d = new Dog(4);
        Dog d2 = new Dog();
    }
}
