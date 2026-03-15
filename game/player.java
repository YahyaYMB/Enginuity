package com.example.EduPlan.game;

public class player extends sprite{
    //Player attributes
    private int level;
    private int experience;

    //Constructor
    public player(String name, int health, int attackPower, boolean good, int level, int experience) {
        super(name, health, attackPower, good);
        this.level = level;
        this.experience = experience;
    }//constructor

    //Getting player level
    public int getLevel() {
        return level;
    }//getLevel

    //Setting player level
    public void setLevel(int level) {
        this.level = level;
    }//setLevel

    //Getting player experience
    public int getExperience() {
        return experience;
    }//getExperience

    //Setting player experience
    public void setExperience(int experience) {
        this.experience = experience;
    }//setExperience
}//player class
