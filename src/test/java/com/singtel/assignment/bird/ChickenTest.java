package com.singtel.assignment.bird;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.animal.bird.Chicken;
import com.singtel.assignment.utils.AnimalTypeEnum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ChickenTest {
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
    public void whenTypeEqualsChickenReturnChicken() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CHICKEN);
        assertTrue(result instanceof Chicken);
    }

    @Test
    public void whenTypeEqualsRoosterReturnRoster() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.ROOSTER);
        assertEquals(Boolean.TRUE, ((Chicken) result).isMale());
    }

    @Test
    public void canChickenSing() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CHICKEN);
        assertTrue(result instanceof ISingable);
    }

    @Test
    public void canChickenWalk() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CHICKEN);
        assertTrue(result instanceof IWalkable);
    }

    @Test
    public void chickenCannotFly() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CHICKEN);
        assertTrue(!(result instanceof IFlyable));
    }

    @Test
    public void chickenCannotSwim() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CHICKEN);
        assertTrue(!(result instanceof ISwimmable));
    }
}
