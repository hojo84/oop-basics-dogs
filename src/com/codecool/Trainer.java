package com.codecool;

import com.codecool.dogs.Dog;
import com.codecool.tricks.Trick;

import java.util.ArrayList;
import java.util.List;

public class Trainer implements TrainDog {
    private List<Dog> dogsInSchool= new ArrayList<>();

    public void registerDog(Dog dog) {
        dogsInSchool.add(dog);
    }

    @Override
    public boolean feedDog(Dog dog, int food) {
        dog.eatFood(food);
        return true;
    }

    @Override
    public boolean makeDogDoTrick(Dog dog, Trick trick) {
        return dog.doTrick(trick);
    }
}
