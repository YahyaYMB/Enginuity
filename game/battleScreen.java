package com.example.EduPlan.game;

public class battleScreen {
    //Game screen attributes
    private player player;
    private enemy currentEnemy;
    private battleScreen battle;

    //Constructor
    public gameScreen(player player, enemy currentEnemy) {
        this.player = player;
        this.currentEnemy = currentEnemy;
        this.battle = new battleScreen(player, currentEnemy);
    }//constructor

    //Start the battle
    public boolean startBattle() {
        while (!battle.isBattleOver()) {
            battle.playerAttack();
            if (battle.isBattleOver()) {
                break;
            }//if
            battle.enemyAttack();
        }//while

        return battle.checkWin();
    }//startBattle
}//batleScreen class
