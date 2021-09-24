package com.company.EnemyFabric.Implemets;

import com.company.EnemyFabric.EnemyFactory;
import com.company.Entity.Enemy.Enemy;
import com.company.Entity.Entity;

public class DefaultEnemyFactory implements EnemyFactory {
    @Override
    public Entity createEnemy() {
        return new Enemy();
    }
}
