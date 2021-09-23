package com.company.Entity.Skills.EnemySkills;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Entity;
import com.company.Entity.Skills.Skills;

public class EnemySkills implements Skills {
    Calculations calculations = new Calculations();
    @Override
    public Entity defaultAttack(Entity hero) {
        return hero;
    }
    @Override
    public Entity restoreHealth(Entity enemy) {
        enemy.setHealth(enemy.getHealth() + calculations.getValueOfPercent(enemy.getHealth(), 25));
        return enemy;
    }
}
