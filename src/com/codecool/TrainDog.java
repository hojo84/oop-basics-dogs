package com.codecool;

import com.codecool.dogs.Dog;
import com.codecool.tricks.Trick;

public interface TrainDog {
    boolean feedDog(Dog dog, int food);
    boolean makeDogDoTrick(Dog dog, Trick trick);
}
