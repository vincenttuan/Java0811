package com.pcschool.ocp.d05;

class Animal {
    public Animal() {
        System.out.println("執行 Animal 建構子");
    }
}

class Dog extends Animal {
    public Dog() {
        System.out.println("執行 Dog 建構子");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
