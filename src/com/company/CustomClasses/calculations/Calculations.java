package com.company.CustomClasses.calculations;

import java.util.Random;

public class Calculations {
    private final Random random = new Random();
    private int diff;

    public int getValueOfPercent(int value, int percent) {
        return (value * percent) / 100;
    }

    public int getRandomNumberWithBounds(int lowBound, int highBound) {
        diff = highBound - lowBound;
        return random.nextInt(diff + 1) + lowBound;
    }
}
