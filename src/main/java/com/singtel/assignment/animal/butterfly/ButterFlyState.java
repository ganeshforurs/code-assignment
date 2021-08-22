package com.singtel.assignment.animal.butterfly;

import com.singtel.assignment.animal.IFlyable;
import com.singtel.assignment.utils.AnimalConstants;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */

public class ButterFlyState extends Butterfly implements IFlyable {
    @Override
    public void fly() {
        System.out.println(AnimalConstants.FLYING);
    }
}
