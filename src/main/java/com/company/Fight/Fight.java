package com.company.Fight;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Hero.Hero;
import com.company.Main;
import com.company.WolrdGenerations.WorldGeneration.WorldGeneration;

import java.util.Scanner;

public class Fight {
    Scanner scan = new Scanner(System.in);
    Calculations calculations = new Calculations();
    WorldGeneration worldGeneration = new WorldGeneration();
    private Integer userInput;
    private Integer enemyInput;

    public void fight(Hero hero, Enemy enemy) {
        System.out.println("Ваше здоровье: " + hero.getHealth() + " Ваш урон: " + hero.getDamage(hero));
        System.out.println("Здоровье врага: " + enemy.getHealth() + " Урон врага: " + enemy.getDamage());
        if (enemyIsAlive(enemy)) {
            displayMenu();
            heroesTurn(hero, enemy);
        }
        if(!enemyIsAlive(enemy)){
            worldGeneration.displayMenu(hero);
        }
        System.out.println("Ваше здоровье: " + hero.getHealth() + " Ваш урон: " + hero.getDamage(hero));
        System.out.println("Здоровье врага: " + enemy.getHealth() + " Урон врага: " + enemy.getDamage());
        if (heroIsAlive(hero)) {
            enemiesTurn(hero, enemy);
        }else {
            endFight();
        }
        if (!heroIsAlive(hero)) {
            endFight();
        }else{
            fight(hero, enemy);
        }

    }

    public void displayMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие(1-обычная атака 2-использовать зелье исцеления): ");
        this.userInput = scan.nextInt();
    }

    public void heroesTurn(Hero hero, Enemy enemy) {
        switch (this.userInput) {
            case 1:
                hero.getHeroSkills().defaultAttack(hero, enemy);
                break;
            case 2:
                hero.getHeroSkills().restoreHealth(hero);
                break;
        }
    }

    public void enemiesTurn(Hero hero, Enemy enemy) {
        this.enemyInput = calculations.getRandomNumberWithBounds(1, 1);
        switch (this.enemyInput) {
            case 1:
                System.out.println("Противник делает обычную атаку: ");
                enemy.getEnemySkills().defaultAttack(hero, enemy);
                break;
            case 2:
                System.out.println("Противник хилится: ");
                enemy.getEnemySkills().restoreHealth(enemy);
                break;
        }
    }


    public boolean heroIsAlive(Hero hero) {
        if (hero.getHealth() <= 0) {
            System.out.println("Hero is dead...");
            return false;
        } else {
            return true;
        }
    }

    public boolean enemyIsAlive(Enemy enemy) {
        if (enemy.getHealth() <= 0) {
            System.out.println("Enemy is dead!!!");
            return false;
        } else {
            return true;
        }
    }

    public void endFight() {
        System.out.println("Игра начинается заново ");
        worldGeneration.startGame();
    }
}
