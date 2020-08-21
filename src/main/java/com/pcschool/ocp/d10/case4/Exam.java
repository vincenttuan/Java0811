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
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.score;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Exam other = (Exam) obj;
        if (this.score != other.score) {
            return false;
        }
        return true;
    }

    

    
    
    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }
    
}
