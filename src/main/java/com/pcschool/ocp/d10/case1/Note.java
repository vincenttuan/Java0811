package com.pcschool.ocp.d10.case1;

public class Note {
    int data;

    public Note(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Note{" + "data=" + data + '}';
    }
    
}
