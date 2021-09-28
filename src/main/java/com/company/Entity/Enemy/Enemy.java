package com.company.Entity.Enemy;

import com.company.CustomClasses.calculations.Calculations;
import com.company.EnemyFabric.Implemets.DefaultEnemyFactory;
import com.company.Entity.Entity;
import com.company.Entity.Skills.EnemySkills.EnemySkills;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends Entity {
    private EnemySkills enemySkills = new EnemySkills();
    private final static Calculations calculations = new Calculations();

    public static Enemy getStatsOfEnemy(){
        Enemy enemy = new DefaultEnemyFactory().createEnemy();
        enemy.setLevel(calculations.getRandomNumberWithBounds(1, 3));
        enemy.setHealth(enemy.getLevel() * 100);
        enemy.setDamage(enemy.getLevel() * 20);
        return enemy;
    }
}
