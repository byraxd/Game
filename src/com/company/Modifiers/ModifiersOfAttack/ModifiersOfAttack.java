package com.company.Modifiers.ModifiersOfAttack;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Entity;
import com.company.Entity.Hero.Hero;

public class ModifiersOfAttack {
    private final Calculations calculations = new Calculations();

    private int criticalChance;
    private int criticalPower;

    public ModifiersOfAttack(int criticalChance, int criticalPower) {
        this.criticalChance = criticalChance;
        this.criticalPower = criticalPower;
    }

    public boolean attackIsCritical(Hero hero){
        return hero.getModifiersOfAttack().getCriticalChance() >= calculations.getRandomNumberWithBounds(0, 100);
    }

    public int getCountedCriticalDamageIfAttackIsCritical(Hero hero){
        if(attackIsCritical(hero)){
            return (calculations.getValueOfPercent(hero.getDamage(), hero.getModifiersOfAttack().getCriticalPower())/100)*(100 -hero.getModifiersOfDefense().getAbsorption());
        }else{
            return (hero.getDamage()/100)*(100 -hero.getModifiersOfDefense().getAbsorption());
        }
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getCriticalPower() {
        return criticalPower;
    }

    public void setCriticalPower(int criticalPower) {
        this.criticalPower = criticalPower;
    }
}
