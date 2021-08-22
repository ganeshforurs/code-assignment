package com.singtel.assignment.animal;

import com.singtel.assignment.animal.bird.Bird;
import com.singtel.assignment.animal.bird.Chicken;
import com.singtel.assignment.animal.bird.Duck;
import com.singtel.assignment.animal.bird.Parrot;
import com.singtel.assignment.animal.butterfly.Butterfly;
import com.singtel.assignment.animal.fish.ClownFish;
import com.singtel.assignment.animal.fish.Dolphin;
import com.singtel.assignment.animal.fish.Shark;
import com.singtel.assignment.utils.AnimalTypeEnum;
import com.singtel.assignment.utils.InsectStateEnum;
import com.singtel.assignment.utils.NeighbourTypeEnum;
import org.springframework.stereotype.Component;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */
@Component
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
                return new Bird(type.BIRD.name());
            case CHICKEN:
                return new Chicken(Boolean.FALSE,type.CHICKEN.name());
            case DUCK:
                return new Duck();
            case ROOSTER:
                return new Chicken(Boolean.TRUE,type.ROOSTER.name());
            case PARROT:
                return new Parrot();
            case PARROT_NEAR_DOG:
                return new Parrot(NeighbourTypeEnum.DOG,AnimalTypeEnum.PARROT_NEAR_DOG.name());
            case PARROT_NEAR_CAT:
                return new Parrot(NeighbourTypeEnum.CAT,AnimalTypeEnum.PARROT_NEAR_CAT.name());
            case PARROT_NEAR_ROOSTER:
                return new Parrot(NeighbourTypeEnum.ROOSTER,AnimalTypeEnum.PARROT_NEAR_ROOSTER.name());
            case PARROT_NEAR_DUCK:
                return new Parrot(NeighbourTypeEnum.DUCK,AnimalTypeEnum.PARROT_NEAR_DUCK.name());
            case PARROT_NEAR_PHONE:
                return new Parrot(NeighbourTypeEnum.PHONE,AnimalTypeEnum.PARROT_NEAR_PHONE.name());
            case SHARK:
                return new Shark();
            case CLOWN_FISH:
                return new ClownFish();
            case DOLPHIN:
                return new Dolphin();
            case BUTTERFLY:
                return new Butterfly(InsectStateEnum.CATERPILLAR);
            default:
                return null;
        }
    }
}
