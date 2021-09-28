package com.company.WolrdGenerations.LevelOfImmersionInTheAbyss.LevelFirst;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirstLayer {
    private String name = "The Edge of the Abyss";
    private int minLevelOfHero;
    private int minLevelOfEnemy;
    private int minNumberOfMetersOfDiving = 0;
    private int maxNumberOfMetersOfDiving = 1350;

    private DebuffInTheLiftingOfTheFirstLayer debuffInTheLiftingOfTheFirstLayer = new DebuffInTheLiftingOfTheFirstLayer();
}
