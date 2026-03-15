package com.example.EduPlan.game;

public class sprite {
    //Sprite attributes
    private String name;
    private int health;
    private int attackPower;
    private boolean good;
    private boolean alive = true;

    //Constructor
    public sprite(String name, int health, int attackPower, boolean good) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.good = good;
    }//constructor

    //Getters and Setters
    //Getting sprite name
    public String getName() {
        return name;
    }//getName

    //Getting sprite health
    public int getHealth() {
        return health;
    }//getHealth

    //Setting sprite health
    //health - directly setting health
    public void setHealth(int health) {
        this.health = health;
    }//setHealth

    //Taking damage to sprite health
    //damage - deducted or added health points ('+' healing, '-' damage)
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.health = 0;
            this.alive = false;
        }//if
        else{
            this.alive = true;
        }//else
    }//takeDamage

    //Getting sprite attack power
    public int getAttackPower() {
        return attackPower;
    }//getAttackPower

    //Setting sprite attack power
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }//setAttackPower

    //Getting if sprite is good or bad
    public boolean isGood() {
        return good;
    }//isGood

    //Checking if sprite is alive
    public boolean isAlive() {
        return alive;
    }//isAlive
}//sprite class
