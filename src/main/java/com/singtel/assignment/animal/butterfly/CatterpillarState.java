package com.singtel.assignment.animal.butterfly;

import com.singtel.assignment.animal.IWalkable;
import com.singtel.assignment.utils.AnimalConstants;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */

public class CatterpillarState extends Butterfly implements IWalkable {
    @Override
    public void walk() {
        System.out.println(AnimalConstants.WALKING);
    }
}
