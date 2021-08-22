package com.singtel.assignment.animal.bird;

import com.singtel.assignment.animal.IFlyable;
import com.singtel.assignment.animal.ISingable;
import com.singtel.assignment.animal.IWalkable;
import com.singtel.assignment.utils.AnimalConstants;
import com.singtel.assignment.utils.NeighbourTypeEnum;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */
public class Parrot extends Bird implements IFlyable, IWalkable, ISingable {

    private NeighbourTypeEnum neighbourType;

    public Parrot() {

    }

    public Parrot(NeighbourTypeEnum animalFriendType) {
        this.setNeighbourType(animalFriendType);
    }

    public NeighbourTypeEnum getNeighbourType() {
        return neighbourType;
    }

    public void setNeighbourType(NeighbourTypeEnum neighbourType) {
        this.neighbourType = neighbourType;
    }

    @Override
    public void walk() {
        System.out.println(AnimalConstants.WALKING);
    }

    @Override
    public void fly() {
        System.out.println(AnimalConstants.FLYING);
    }

    @Override
    public void sing() {
        switch (this.getNeighbourType()) {
            case CAT:
                System.out.println(AnimalConstants.CAT_SOUND);
                break;
            case DOG:
                System.out.println(AnimalConstants.DOG_SOUND);
                break;
            case DUCK:
                System.out.println(AnimalConstants.DUCK_SOUND);
                break;
            case ROOSTER:
                System.out.println(AnimalConstants.ROOSTER_SOUND);
                break;
            case PHONE:
                System.out.println(AnimalConstants.PHONE_SOUND);
                break;
            default:
                System.out.println(AnimalConstants.PARROT_SOUND);

        }

    }
}
