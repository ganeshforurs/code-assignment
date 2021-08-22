package com.singtel.assignment.animal.bird;

import com.singtel.assignment.animal.ISingable;
import com.singtel.assignment.animal.IWalkable;
import com.singtel.assignment.utils.AnimalConstants;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */
public class Chicken extends Bird implements IWalkable, ISingable {

    public Chicken() {
    }

    public Chicken(boolean isMale) {
        this.setMale(isMale);
    }

    @Override
    public void walk() {
        System.out.println(AnimalConstants.WALKING);
    }

    @Override
    public void sing() {
        if (this.isMale()) {
            System.out.println(AnimalConstants.ROOSTER_SOUND);
        } else {
            System.out.println(AnimalConstants.CHICKEN_SOUND);

        }
    }
}
