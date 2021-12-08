package com.codecool.dogs;

import com.codecool.tricks.Trick;

import java.util.HashSet;
import java.util.Set;

public abstract class Dog {
    private final int MAX_HUNGER_LEVEL = 100;
    protected final String name;
    protected int hunger;
    protected Set<Trick> tricks;

    public Dog(String name) {
        this.name = name;
        this.hunger = MAX_HUNGER_LEVEL;  //meaning dog is 100% full
        this.tricks = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getHungerLevel() {
        return hunger;
    }

    public void eatFood(int food) {
        this.hunger += food;
        if (hunger > MAX_HUNGER_LEVEL) hunger = MAX_HUNGER_LEVEL;
    }

    public void bark() {
        System.out.println("bark bark");
    }

    abstract boolean learnTrick(Trick trick);

    public boolean doTrick(Trick trick) {
        if (hunger >= 60 && tricks.contains(trick)) {
            trick.printName();
            hunger -= trick.getTrickEnergy();
            return true;
        } else {
            System.out.println("Cannot perform trick due to hunger level or trick not yet learned");
            return false;
        }
    }


}
