package com.singtel.assignment.animal.fish;

import com.singtel.assignment.animal.ICarnivouros;
import com.singtel.assignment.utils.AnimalConstants;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;

public class Shark extends Fish implements ICarnivouros {

    public Shark() {
        this.setSize(Size.LARGE);
        this.setColor(Color.GREY);
    }

    @Override
    public void eatFish() {
        System.out.println(AnimalConstants.EATING_OTHER_FISH);
    }
}
