package com.company.Entity.Skills.HeroSkills;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Entity;
import com.company.Entity.Hero.Hero;
import com.company.Entity.Skills.Skills;

public class HeroSkills implements Skills {
    Calculations  calculations = new Calculations();
    @Override
    public Entity defaultAttack(Hero hero, Enemy enemy) {
        if(hero.getModifiers().attackIsCritical(hero)){
            enemy.setHealth(enemy.getHealth() -  (hero.getDamage(hero) + calculations.getValueOfPercent(hero.getDamage(hero),
                    hero.getModifiers().getCriticalDamage(hero))));
        }else {
            enemy.setHealth(enemy.getHealth() - hero.getDamage(hero));
        }
        return enemy;
    }

    @Override
    public Entity restoreHealth(Entity hero) {
        hero.setHealth(hero.getHealth() + calculations.getValueOfPercent(hero.getHealth(), 25));
        return hero;
    }
}
