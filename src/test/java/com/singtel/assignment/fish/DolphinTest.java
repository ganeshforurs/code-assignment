package com.singtel.assignment.fish;

import com.singtel.assignment.animal.AnimalFactory;
import com.singtel.assignment.animal.IAnimal;
import com.singtel.assignment.animal.ICarnivouros;
import com.singtel.assignment.animal.ISwimmable;
import com.singtel.assignment.animal.fish.Dolphin;
import com.singtel.assignment.animal.fish.Fish;
import com.singtel.assignment.utils.AnimalTypeEnum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class DolphinTest {
    AnimalFactory animalFactory = null;

    @Before
    public void setUp() {
        animalFactory = new AnimalFactory();
    }

    @After
    public void clear() {
        animalFactory = null;
    }


    @Test
    public void isDolphinNotAFish() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DOLPHIN);
        assertTrue(!(result instanceof Fish));
    }

    @Test
    public void whenTypeEqualsDolphinReturnDolphin() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DOLPHIN);
        assertTrue(result instanceof Dolphin);
    }

    @Test
    public void canDolphinSwim() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DOLPHIN);
        assertTrue(result instanceof ISwimmable);
    }

    @Test
    public void whenDolphinIsNotCarnivorous() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DOLPHIN);
        assertTrue(!(result instanceof ICarnivouros));
    }
}
