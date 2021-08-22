package com.singtel.assignment.animal.bird;


import com.singtel.assignment.animal.ISingable;
import com.singtel.assignment.animal.ISwimmable;
import com.singtel.assignment.animal.IWalkable;
import com.singtel.assignment.utils.AnimalConstants;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */
public class Duck extends Bird implements IWalkable, ISingable, ISwimmable {

    public Duck() {
    }
    public Duck(String name){
        this.setName(name);
    }

    @Override
    public void sing() {
        System.out.println(AnimalConstants.DUCK_SOUND);
    }

    @Override
    public void swim() {
        System.out.println(AnimalConstants.SWIMMING);
    }

    @Override
    public void walk() {
        System.out.println(AnimalConstants.WALKING);
    }
}
