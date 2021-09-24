package com.company.Entity.Skills.EnemySkills;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Entity;
import com.company.Entity.Hero.Hero;
import com.company.Entity.Skills.Skills;

public class EnemySkills implements Skills {
    Calculations calculations = new Calculations();
    @Override
    public Entity defaultAttack(Hero hero, Enemy enemy) {
        if(25 >= calculations.getRandomNumberWithBounds(0,100)){
            hero.setHealth(hero.getHealth() -  (enemy.getDamage() + calculations.getValueOfPercent(enemy.getDamage(),
                    50)));
        }else {
            hero.setHealth(hero.getHealth() -  enemy.getDamage());
        }
        return hero;
    }
    @Override
    public Entity restoreHealth(Entity enemy) {
        enemy.setHealth(enemy.getHealth() + calculations.getValueOfPercent(enemy.getHealth(), 25));
        return enemy;
    }
}
