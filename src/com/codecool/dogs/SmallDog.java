package com.codecool.dogs;

import com.codecool.tricks.CircusTrick;
import com.codecool.tricks.Trick;

public class SmallDog extends Dog {

    public SmallDog(String name) {
        super(name);
    }

    @Override
    public boolean learnTrick(Trick trick) {
        if (trick instanceof CircusTrick) {
            tricks.add(trick);
            return true;
        } else return false;
    }
}
