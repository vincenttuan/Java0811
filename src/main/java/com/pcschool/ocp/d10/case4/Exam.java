package com.pcschool.ocp.d10.case4;

public class Exam {
    private int score;

    public Exam(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }
    
}
