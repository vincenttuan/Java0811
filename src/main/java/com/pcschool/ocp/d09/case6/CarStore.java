package com.pcschool.ocp.d09.case6;

public class CarStore {
    public static void main(String[] args) {
        // 透過 Rideable 的 getCar(name) 取得 Car 物件
        Rideable ride1 = new Rideable() {
            @Override
            public Car getCar(String name) {
                return new Car(name);
            }
        };
        Car car1 = ride1.getCar("BMW");
        System.out.println(car1);
        
        // lambda
        Rideable ride2 = (name) -> new Car(name);
        Car car2 = ride2.getCar("BMW");
        System.out.println(car2);
        
        // lambda ::
        Rideable ride3 = Car::new;
        Car car3 = ride3.getCar("BMW");
        System.out.println(car3);
    }
}
