package com.company.Fight;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Hero.Hero;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fight {
    Scanner scan = new Scanner(System.in);
    Calculations calculations = new Calculations();
    private Integer userInput;
    private Integer enemyInput;

    public void fight(Hero hero, Enemy enemy){
        displayMenu();
        heroesTurn(hero, enemy);
        enemiesTurn(hero, enemy);
        fight(hero, enemy);

    }

    public void displayMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие(1-обычная атака 2-использовать зелье исцеления): ");
        this.userInput = scan.nextInt();
    }

    public void heroesTurn(Hero hero, Enemy enemy){
        if(enemyIsAlive(enemy)) {
            switch (this.userInput) {
                case 1:
                    hero.getHeroSkills().defaultAttack(hero, enemy);
                case 2:
                    hero.getHeroSkills().restoreHealth(hero);
            }
        }
    }

    public void enemiesTurn(Hero hero, Enemy enemy){
        this.enemyInput = calculations.getRandomNumberWithBounds(1,2);
        if(heroIsAlive(hero)) {
            switch (this.userInput) {
                case 1:
                   enemy.getEnemySkills().defaultAttack(hero, enemy);
                case 2:
                    enemy.getEnemySkills().restoreHealth(enemy);
            }
        }
    }


    public boolean heroIsAlive(Hero hero){
        if(hero.getHealth() <= 0){
            System.out.println("Hero is dead...");
            return false;
        }else{
            return true;
        }
    }

    public boolean enemyIsAlive(Enemy enemy){
        if(enemy.getHealth() <= 0){
            System.out.println("Enemy is dead!!!");
            return false;
        }else{
            return true;
        }
    }

    public void endFight(){
        System.out.println("Бой окончен");

    }
}
