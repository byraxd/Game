package com.company.Modifiers;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Hero.Hero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Modifiers {
    private final Calculations calculations = new Calculations();

    private int strength;
    private int agility;
    private int intellect;
    private int luck;

    public static Modifiers getModifiersForHero() {
        Modifiers modifiers = new Modifiers();
        modifiers.setStrength(5);
        modifiers.setAgility(5);
        modifiers.setIntellect(5);
        modifiers.setLuck(5);
        return modifiers;
    }

    public int getCriticalChance(Hero hero) {
        return hero.getLevel() + ((hero.getModifiers().getAgility() * 3) + (hero.getModifiers().getLuck() * 2));
    }

    public int getCriticalDamage(Hero hero) {
        return 50 + (hero.getLevel() + ((hero.getModifiers().getStrength()*3) + (hero.getModifiers().getIntellect()*2)));
    }

    public boolean attackIsCritical(Hero hero){
        if(getCriticalChance(hero) >= calculations.getRandomNumberWithBounds(0, 100)){
            return true;
        }else {
            return false;
        }
    }
}
