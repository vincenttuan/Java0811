package com.pcschool.ocp.d10.case2;

public class NoteCollection {
    public static void main(String[] args) {
        Note n3 = new Note(80);
        Note n2 = new Note(90);
        Note n1 = new Note(100);
        
        n3.setPreviousNote(n2);
        n2.setNextNote(n3);
        n2.setPreviousNote(n1);
        n1.setNextNote(n2);
        
        System.out.println(n1.getNextNotes());
        System.out.println(n3.getPreviousNotes());
        
        // 要插入在 100~90 之間 ?
        // add(Note)
        Note n4 = new Note(95);
        
        // remove(某一個Note)
        
    }
}
