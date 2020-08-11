package com.pcschool.ocp.d01;

// 寵物店
public class PetStore {
    // 主程式
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        // d1, d2, d3 資料設定
        d1.type = "拉不拉多";d1.age = 5;d1.price = 5000;d1.amount = 30;
        d2.type = "拉不拉多";d2.age = 2;d2.price = 3000;d2.amount = 20;
        d3.type = "拉不拉多";d3.age = 4;d3.price = 8000;d3.amount = 10;
        // d1, d2, d3 資料印出
        System.out.printf("品種: %s 年齡: %d 價格: %d 數量: %d\n", d1.type, d1.age, d1.price, d1.amount);
        System.out.printf("品種: %s 年齡: %d 價格: %d 數量: %d\n", d2.type, d2.age, d2.price, d2.amount);
        System.out.printf("品種: %s 年齡: %d 價格: %d 數量: %d\n", d3.type, d3.age, d3.price, d3.amount);
        
    }
}
