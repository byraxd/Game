package com.company.Entity.Hero;

import com.company.Entity.Entity;
import com.company.Modifiers.ModifiersOfAttack.ModifiersOfAttack;
import com.company.Modifiers.ModifiersOfDefense.ModifiersOfDefense;

public class Hero extends Entity {
    private int strength;
    private int agility;
    private int stamina;
    private int intellect;
    private int luck;
    private int exp;

    private final ModifiersOfAttack modifiersOfAttack = new ModifiersOfAttack(getLevel() +((getAgility()*2) + getLuck()*2),
            getLevel() +((getStrength()*4)+(getIntellect()*4)));

    private final ModifiersOfDefense modifiersOfDefense = new ModifiersOfDefense(getLevel() + ((getStrength()*2)+(getStamina()*2)));

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public ModifiersOfAttack getModifiersOfAttack() {
        return modifiersOfAttack;
    }

    public ModifiersOfDefense getModifiersOfDefense() {
        return modifiersOfDefense;
    }
}
