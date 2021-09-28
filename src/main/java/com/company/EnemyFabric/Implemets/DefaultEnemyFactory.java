package com.company.EnemyFabric.Implemets;

import com.company.CustomClasses.calculations.Calculations;
import com.company.EnemyFabric.EnemyFactory;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Entity;

public class DefaultEnemyFactory implements EnemyFactory {
    private final Calculations calculations = new Calculations();
    @Override
    public Enemy createEnemy() {
        return new Enemy();
    }
}
