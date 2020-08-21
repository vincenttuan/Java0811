package com.pcschool.ocp.d10.case6;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("John");
        stack.push("Mary");
        stack.push("Helen");
        System.out.println("進電梯順序:" + stack);
        System.out.println("出電梯順序:");
        while (!stack.isEmpty()) {            
            String name = stack.pop();
            System.out.println(name);
        }
    }
}
