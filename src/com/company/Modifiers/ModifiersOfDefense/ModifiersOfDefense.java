package com.company.Modifiers.ModifiersOfDefense;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Hero.Hero;

public class ModifiersOfDefense {
    private int absorption;

    private final Calculations calculations = new Calculations();

    public ModifiersOfDefense(int absorption) {
        this.absorption = absorption;
    }

    public int getAbsorption() {
        return absorption;
    }

    public void setAbsorption(int absorption) {
        this.absorption = absorption;
    }

}
