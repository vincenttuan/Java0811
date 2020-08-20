package com.pcschool.ocp.d09.case1;

public class MyOuterMain {
    public static void main(String[] args) {
        MyOuter.MyInner mi = new MyOuter().new MyInner();
        mi.print();
        System.out.println("----------------------------");
        MyOuter.MyStaticInner msi = new MyOuter.MyStaticInner();
        msi.print();
    }
}
