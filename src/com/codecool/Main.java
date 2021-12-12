package com.codecool;

import com.codecool.dogs.BigDog;
import com.codecool.dogs.Dog;
import com.codecool.dogs.SmallDog;
import com.codecool.tricks.CircusTrick;
import com.codecool.tricks.GuardingTrick;
import com.codecool.tricks.Trick;

public class Main {

    public static void main(String[] args) {
        Dog dog1= new SmallDog("Buksi");
        Dog dog2= new BigDog("Ficko");
        Dog dog3= new BigDog("Pofi");

        Trainer trainer = new Trainer();

        trainer.registerDog(dog1);
        trainer.registerDog(dog2);
        trainer.registerDog(dog3);

        Trick trick1 = new GuardingTrick("Guarding trick 1");
        Trick trick2 = new GuardingTrick("Guarding trick 2");
        Trick trick3 = new CircusTrick("Circus trick 1");
        Trick trick4 = new CircusTrick("Circus trick 2");

        ((SmallDog) dog1).learnTrick(trick3);
        ((SmallDog) dog1).learnTrick(trick1);
        ((BigDog) dog2).learnTrick(trick2);
        ((BigDog) dog2).learnTrick(trick4);

        trainer.feedDog(dog1,20);
        trainer.makeDogDoTrick(dog2, trick1);
        trainer.makeDogDoTrick(dog2, trick4);
        trainer.makeDogDoTrick(dog2, trick2);
        trainer.makeDogDoTrick(dog2, trick2);
        trainer.makeDogDoTrick(dog2, trick2);
        System.out.println(dog2.getHungerLevel());
        trainer.feedDog(dog2,30);
        System.out.println(dog2.getHungerLevel());
        trainer.makeDogDoTrick(dog2, trick2);
        System.out.println(dog2.getHungerLevel());
    }
}
