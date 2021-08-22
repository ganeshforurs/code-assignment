package com.singtel.assignment.animal;

import com.singtel.assignment.utils.AnimalConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Author Ganesh T
 * crated by 22-Aug-2021
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal implements IAnimal{

    private boolean male;

    public void walk(){
        System.out.println(AnimalConstants.WALKING);
    }
}
