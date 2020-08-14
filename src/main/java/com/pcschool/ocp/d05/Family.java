package com.pcschool.ocp.d05;

import com.pcschool.ocp.d05.foo.Son2;
import com.pcschool.ocp.d05.foo.Son3;

public class Family {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
        
        Son2 son2 = new Son2();
        son2.print();
        
        Son3 son3 = new Son3();
        son3.print();
    }
}
