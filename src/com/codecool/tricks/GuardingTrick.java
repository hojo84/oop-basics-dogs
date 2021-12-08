package com.codecool.tricks;

public class GuardingTrick extends Trick {
    private static final int TRICK_ENERGY_LEVEL = 20;

    public GuardingTrick(String name) {
        super(name, TRICK_ENERGY_LEVEL);
    }
}
