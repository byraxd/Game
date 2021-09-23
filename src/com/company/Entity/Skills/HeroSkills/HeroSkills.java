package com.company.Entity.Skills.HeroSkills;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Entity;
import com.company.Entity.Hero.Hero;
import com.company.Entity.Skills.Skills;
import com.company.Modifiers.ModifiersOfAttack.ModifiersOfAttack;
import com.company.Modifiers.ModifiersOfDefense.ModifiersOfDefense;

public class HeroSkills implements Skills {
    Calculations  calculations = new Calculations();
    private final Hero hero = new Hero();
    @Override
    public Entity defaultAttack(Entity enemy) {
        enemy.setHealth(enemy.getHealth() - hero.getModifiersOfAttack().getCountedCriticalDamageIfAttackIsCritical(hero));
        return enemy;
    }

    @Override
    public Entity restoreHealth(Entity hero) {
        hero.setHealth(hero.getHealth() + calculations.getValueOfPercent(hero.getHealth(), 25));
        return hero;
    }
}
