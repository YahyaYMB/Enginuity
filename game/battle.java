package com.example.EduPlan.game;

public class battle{
    //Battle screen attributes
    private sprite player;
    private enemy currentEnemy;

    //Constructor
    public battleScreen(sprite player, enemy currentEnemy) {
        this.player = player;
        this.currentEnemy = currentEnemy;
    }//constructor

    //Player attacks enemy
    public void playerAttack() {
        int damage = player.getAttackPower();
        currentEnemy.takeDamage(damage);
    }//playerAttack

    //Enemy attacks player
    public void enemyAttack() {
        int damage = currentEnemy.getAttackPower();
        player.takeDamage(damage);
    }//enemyAttack

    //Check if battle is over
    public boolean isBattleOver() {
        return !player.isAlive() || !currentEnemy.isAlive();
    }//isBattleOver

    //Get battle result
    public boolean checkWin() {
        if (!player.isAlive()) {
            return false;
        }//if
        else if (!currentEnemy.isAlive()) {
            return true;
        }//else if
        else {
            return false;
        }//else
    }//checkWin
}//battle class
