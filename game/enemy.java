package com.example.EduPlan.game;

public class enemy extends sprite{
    //Enemy attributes
    private String type;
    private boolean boss;

    //Constructor
    public enemy(String name, int health, int attackPower, boolean good, String type, boolean boss) {
        super(name, health, attackPower, good);
        this.type = type;
        this.boss = boss;
    }//constructor

    //Getting enemy type
    public String getType() {
        return type;
    }//getType

    //Getting if enemy is a boss
    public boolean isBoss() {
        return boss;
    }//isBoss
}//enemy class
