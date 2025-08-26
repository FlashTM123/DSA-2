package com.example.baitap4;

public class Player {
    private String name;
    private double score;
    public Player(String name, double score) {
        this.name = name;
        this.score = score;
    
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Player [name=" + name + ", score=" + score + "]";
    }
    
    

    
}
