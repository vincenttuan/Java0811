package com.pcschool.ocp.d10.case1;

public class NoteCollection {
    public static void main(String[] args) {
        Note n3 = new Note(80);
        Note n2 = new Note(90, n3);
        Note n1 = new Note(100, n2);
        System.out.println(n1);
        System.out.println(n1.getData());
        System.out.println(n1.getNextNode().getData());
        System.out.println(n1.getNextNode().getNextNode().getData());
    }
}
