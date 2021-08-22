package com.singtel.assignment.animal.bird;

import com.singtel.assignment.animal.ISingable;
import com.singtel.assignment.animal.IWalkable;
import com.singtel.assignment.utils.AnimalConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */
public class Chicken extends Bird implements IWalkable, ISingable {
    private Map<String, String> sounds= new HashMap<>();
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
            System.out.println( this.sounds.get(this.getLanguageCode()));
        } else {
            System.out.println(AnimalConstants.CHICKEN_SOUND);

        }
    }
    void generateRoosterSounds(){
        sounds.put("Danish","kykyliky");
        sounds.put("Dutch","kukeleku");
        sounds.put("Finnish","kukko kiekuu");
        sounds.put("French","cocorico");
        sounds.put("German","kikiriki");
        sounds.put("Greek","kikeriki");
        sounds.put("Hebrew","coo-koo-ri-koo");
        sounds.put("Hungarian","kukuriku");

    }
}
