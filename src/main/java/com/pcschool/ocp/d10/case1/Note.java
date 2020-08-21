package com.pcschool.ocp.d10.case1;

public class Note {
    private int data;
    private Note nextNode;
    
    public Note(int data) {
        this(data, null);
    }
    
    public Note(int data, Note nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Note getNextNode() {
        return nextNode;
    }

    public void setNextNode(Note nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Note{" + "data=" + data + ", nextNode=" + nextNode + '}';
    }

    
    
}
