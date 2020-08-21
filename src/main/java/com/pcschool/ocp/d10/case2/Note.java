package com.pcschool.ocp.d10.case2;

public class Note {
    private Note previousNote;
    private int data;
    private Note nextNote;

    public Note(int data) {
        this(null, data, null);
    }

    public Note(Note previousNote, int data, Note nextNote) {
        this.previousNote = previousNote;
        this.data = data;
        this.nextNote = nextNote;
    }

    public Note getPreviousNote() {
        return previousNote;
    }

    public void setPreviousNote(Note previousNote) {
        this.previousNote = previousNote;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Note getNextNote() {
        return nextNote;
    }

    public void setNextNote(Note nextNote) {
        this.nextNote = nextNote;
    }

    public String getNextNotes() {
        String s = data + ",";
        Note next = nextNote;
        while (next != null) {
            s += next.getData() + ",";
            next = next.getNextNote();
        }
        return s;
    }
    
    public String getPreviousNotes() {
        String s = data + ",";
        Note previous = previousNote;
        while (previous != null) {
            s += previous.getData() + ",";
            previous = previous.getPreviousNote();
        }
        return s;
    }

    
    
    
}
