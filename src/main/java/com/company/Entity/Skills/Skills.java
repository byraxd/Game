package com.company.Entity.Skills;

import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Entity;
import com.company.Entity.Hero.Hero;

public interface Skills {
    Entity defaultAttack(Hero hero, Enemy enemy);
    public Entity restoreHealth(Entity entity);
}
