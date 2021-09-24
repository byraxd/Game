package com.company.Entity.Enemy;

import com.company.Entity.Entity;
import com.company.Entity.Skills.EnemySkills.EnemySkills;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends Entity {
    private EnemySkills enemySkills = new EnemySkills();
}
