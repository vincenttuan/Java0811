package com.pcschool.ocp.d08.case2;

public interface Pet {

    public static final int legs = 4;

    public abstract void eat();

    public abstract void skill();
    
    default void copyright() {
        System.out.println("Happy 寵物店");
    }
}
