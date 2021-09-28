package com.company.WolrdGenerations.WorldGeneration;

import com.company.CustomClasses.calculations.Calculations;
import com.company.EnemyFabric.Implemets.DefaultEnemyFactory;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Entity;
import com.company.Entity.Hero.Hero;
import com.company.Fight.Fight;

import java.util.Scanner;

public class WorldGeneration {
    private int playerChoice;
    private final Scanner scanner = new Scanner(System.in);
    private final Calculations calculations = new Calculations();

    public void startGame(){
        Hero hero = new Hero();
        displayMenu(Hero.setStatsOfHero(hero));
    }

    public void displayMenu(Hero hero){
        if(hero.getDeep() >= 1350){
            System.out.println("Добро пожаловать во второй слой бездны 'Манящий лес' ");
        }
        System.out.println("Вы находитесь на высоте: " + hero.getDeep());
        System.out.println("Выберите что хотите делать дальше(1-спуститься глубже; 2-подняться выше): ");
        playerChoice = scanner.nextInt();
        if(playerChoice > 2 || playerChoice < 1){
            System.out.println("Вы выбрали не правильное действие");
            displayMenu(hero);
        }
        switch (playerChoice){
            case 1: descendIntoTheAbyss(hero);
            case 2: riseFromTheAbyss(hero);
        }
    }

    public void descendIntoTheAbyss(Hero hero){
        if(30 >= calculations.getRandomNumberWithBounds(0, 100)){
            hero.setDeep(hero.getDeep()+50);
            System.out.println("Вы нарвались на врага... Начинается бой");
            spawnDefaultMob(hero, Enemy.getStatsOfEnemy());
            displayMenu(hero);
        }else{
            hero.setDeep(hero.getDeep()+50);
            displayMenu(hero);
        }
    }
    public void riseFromTheAbyss(Hero hero){
        if(hero.getDeep() >= 50){
            hero.setDeep(hero.getDeep() - 50);
            if(30 >= calculations.getRandomNumberWithBounds(0, 100)){
                hero.setDeep(hero.getDeep() - 50);
                System.out.println("Вы нарвались на врага... Начинается бой");
                spawnDefaultMob(hero, Enemy.getStatsOfEnemy());
            }
        }else{
            System.out.println("Вы находитесь на вершине бездны, в городе 'Орф' ");
            displayMenu(hero);
        }
        displayMenu(hero);
    }

    public void spawnDefaultMob(Hero hero, Enemy enemy){
        new Fight().fight(hero, enemy);
    }
}
