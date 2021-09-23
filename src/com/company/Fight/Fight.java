package com.company.Fight;

import com.company.Entity.Entity;

import java.util.Random;
import java.util.Scanner;

public class Fight {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private int playerChoice, enemyChoice;

    public void herosMove(Entity hero, Entity enemy) {
        System.out.println("Выберите действие(1 - нанести обычный удар, 2 - выпить зелье исцеления): ");
        playerChoice = scan.nextInt();
        playerSelectIsCorrect(hero, enemy);
        selectPlayerAction(playerChoice, hero, enemy);
        if (!heroIsAlive(hero)) {

        } else {
            enemysMove(hero, enemy);
        }
    }

    public void enemysMove(Entity hero, Entity enemy) {
        if (!heroIsAlive(hero)) {

        } else {
            herosMove(hero, enemy);
        }
    }

    public boolean heroIsAlive(Entity hero) {
        if (hero.getHealth() <= 0) {
            System.out.println("Герой мертв, бой окончен ");
            return false;
        } else {
            return true;
        }
    }
    public boolean enemyIsAlive(Entity enemy) {
        if (enemy.getHealth() <= 0) {
            System.out.println("Враг мертв, бой окончен ");
            return false;
        } else {
            return true;
        }
    }

    public void selectPlayerAction(int choice, Entity hero, Entity enemy) {

    }

    public void playerSelectIsCorrect(Entity hero, Entity enemy) {
        if (playerChoice <= 3) {
            System.out.println("Выберите действительное действие");
            herosMove(hero, enemy);
        }
    }
}
