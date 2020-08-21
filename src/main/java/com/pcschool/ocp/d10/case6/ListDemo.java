package com.pcschool.ocp.d10.case6;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);    // Integer
        list.add(0, 3); // Integer
        list.add(4);    // Integer
        list.add(2);    // Integer
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println("我要移除(3): " + list.remove(3));
        System.out.println(list);
        System.out.println("我要移除(Integer(3)): " + list.remove(new Integer(3)));
        System.out.println(list);
        System.out.println("我要移除(Integer(5)): " + list.remove(new Integer(5)));
        System.out.println(list);
    }
}
