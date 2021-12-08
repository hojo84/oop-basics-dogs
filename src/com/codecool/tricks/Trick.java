package com.codecool.tricks;

public abstract class Trick {
    private final String name;
    protected int trickEnergy;

    public Trick(String name, int trickEnergy) {
        this.name = name;
        this.trickEnergy = trickEnergy;
    }

    public void printName() {
        System.out.println(name);
    }

    public int getTrickEnergy() {
        return trickEnergy;
    }
}
