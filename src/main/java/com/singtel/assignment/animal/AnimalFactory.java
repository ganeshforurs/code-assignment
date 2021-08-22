package com.singtel.assignment.animal;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.bird.Chicken;
import com.singtel.assignment.animal.bird.Duck;
import com.singtel.assignment.animal.bird.Parrot;
import com.singtel.assignment.animal.fish.ClownFish;
import com.singtel.assignment.animal.fish.Dolphin;
import com.singtel.assignment.animal.fish.Shark;
import com.singtel.assignment.utils.AnimalTypeEnum;
import com.singtel.assignment.utils.NeighbourTypeEnum;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */

public class AnimalFactory {

    /**
     * Factory Method to create Animal with given input
     *
     * @param type
     * @return
     */
    public IAnimal createAnimal(AnimalTypeEnum type) {
        switch (type) {
            case BIRD:
                return new Bird();
            case CHICKEN:
                return new Chicken(Boolean.FALSE);
            case DUCK:
                return new Duck();
            case ROOSTER:
                return new Chicken(Boolean.TRUE);
            case PARROT:
                return new Parrot();
            case PARROT_NEAR_DOG:
                return new Parrot(NeighbourTypeEnum.DOG);
            case PARROT_NEAR_CAT:
                return new Parrot(NeighbourTypeEnum.CAT);
            case PARROT_NEAR_ROOSTER:
                return new Parrot(NeighbourTypeEnum.ROOSTER);
            case PARROT_NEAR_DUCK:
                return new Parrot(NeighbourTypeEnum.DUCK);
            case PARROT_NEAR_PHONE:
                return new Parrot(NeighbourTypeEnum.PHONE);
            case SHARK:
                return new Shark();
            case CLOWN_FISH:
                return new ClownFish();
            case DOLPHIN:
                return new Dolphin();
            default:
                return null;
        }
    }
}
