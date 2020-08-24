package com.pcschool.ocp.d11.case1;

public class Level implements Comparable<Level>{    
    private int score;
    private String name;

    public Level() {
    }

    public Level(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Level{" + "score=" + score + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Level other) {
        return score - other.score;
    }
    
}
