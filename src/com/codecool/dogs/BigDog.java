package com.codecool.dogs;

import com.codecool.tricks.Trick;

public class BigDog extends Dog {

    public BigDog(String name) {
        super(name);
    }

    @Override
    public boolean learnTrick(Trick trick) {
        tricks.add(trick);
        return true;
    }
}
