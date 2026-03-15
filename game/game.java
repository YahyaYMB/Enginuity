package com.example.EduPlan.game; 

public class game {
    //Map attributes
    private player player;
    private String name;
    private enemy[] enemies; //3-5 per map each in individual areas
    private enemy curEnemy; //current enemy in area

    //Constructor
    public map(String name, String[] areas, enemy[] enemies) {
        this.name = name;
        this.areas = areas;
        this.enemies = enemies;
    }//constructor

    //Getting map name
    public String getName() {
        return name;
    }//getName

    //Exploring an area on the map
    public void explore(int  area) {
        this.curEnemy = enemies[area];
        battleScreen battle = new battleScreen(player, curEnemy);
        if (battle.startBattle()) {
            /*Win logic*/
        }//if
        else {
            /*Loss logic*/
        }//else
    }//exploreArea
}//game class
