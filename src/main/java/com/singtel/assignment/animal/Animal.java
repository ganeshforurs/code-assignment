package com.singtel.assignment.animal;

import com.singtel.assignment.utils.AnimalConstants;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;
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

    private Size size;

    private Color color;

    public void walk(){
        System.out.println(AnimalConstants.WALKING);
    }
}
