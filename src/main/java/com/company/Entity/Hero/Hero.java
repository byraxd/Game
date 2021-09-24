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

    private Modifiers modifiers = Modifiers.getModifiersForHero();
    private HeroSkills heroSkills = new HeroSkills();

    public int getDamage(Hero hero){
        return hero.getLevel() + ((hero.getModifiers().getStrength()*5) + (hero.getModifiers().getIntellect()*2));
    }
}
