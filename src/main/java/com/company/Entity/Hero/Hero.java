package com.company.Entity.Hero;

import com.company.Entity.Entity;
import com.company.Entity.Skills.HeroSkills.HeroSkills;
import com.company.Modifiers.Modifiers;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero extends Entity {
    private int exp;
    private int deep;

    private Modifiers modifiers = Modifiers.getModifiersForHero();
    private static Modifiers modifiers1 = Modifiers.getModifiersForHero();
    private HeroSkills heroSkills = new HeroSkills();

    public static Hero setStatsOfHero(Hero hero){
        hero.setLevel(1);
        hero.setHealth(hero.getLevel() * 100 + ( modifiers1.getStrength() * 50));
        return hero;
    }

    public int getDamage(Hero hero){
        return hero.getLevel() + ((hero.getModifiers().getStrength()*5) + (hero.getModifiers().getIntellect()*2));
    }
}
