package com.singtel.assignment;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.animal.butterfly.Butterfly;

public class CountingAnimals {
    public static void countEachAnimalType(IAnimal[] animals) {
        int swimCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int flyCount = 0;
        for (IAnimal animal : animals) {

            if (animal instanceof Butterfly) {
                ((Butterfly) animal).transform();
            }
            if (animal instanceof ISwimmable) {
                swimCount++;
            }
            if (animal instanceof ISingable) {
                singCount++;
            }
            if (animal instanceof IFlyable) {
                flyCount++;
            }
            if (animal instanceof IWalkable) {
                walkCount++;
            }
            if (animal instanceof Butterfly && (((Butterfly) animal).getCurrentState() instanceof IFlyable)) {
                flyCount++;
            }
        }

        System.out.println("flyCount : " + flyCount);
        System.out.println("walkCount : " + walkCount);
        System.out.println("singCount : " + singCount);
        System.out.println("swimCount : " + swimCount);
    }
}
