package com.company;

import com.company.CustomClasses.calculations.Calculations;
import com.company.Entity.Hero.Hero;
import com.company.WolrdGenerations.WorldGeneration.WorldGeneration;

public class Main {

    public static void main(String[] args) {
        WorldGeneration worldGeneration = new WorldGeneration();
        worldGeneration.startGame();
    }
}
