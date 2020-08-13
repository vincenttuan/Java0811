package com.pcschool.ocp.d03;

public class ArithmeticMethod4 {
    public static void main(String[] args) {
        
    }
}

class Exam {
    private int score;

    public Exam(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }
    
}
