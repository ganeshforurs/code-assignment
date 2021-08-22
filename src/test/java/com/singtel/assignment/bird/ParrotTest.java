package com.singtel.assignment.bird;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.animal.bird.Parrot;
import com.singtel.assignment.utils.AnimalTypeEnum;
import com.singtel.assignment.utils.NeighbourTypeEnum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParrotTest {
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
    public void whenTypeEqualsParrotReturnParrot() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT);
        assertTrue(result instanceof Parrot);
    }


    @Test
    public void canParrotSing() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT);
        assertTrue(result instanceof ISingable);
    }

    @Test
    public void canParrotWalk() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT);
        assertTrue(result instanceof IWalkable);
    }

    @Test
    public void parrotCannotSwim() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT);
        assertTrue(!(result instanceof ISwimmable));
    }


    @Test
    public void canParrotFly() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT);
        assertTrue(result instanceof IFlyable);
    }

    @Test
    public void whenParrotNearDogReturnNeighbourtypeDog() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT_NEAR_DOG);
        assertEquals(NeighbourTypeEnum.DOG, ((Parrot) result).getNeighbourType());
    }


    @Test
    public void whenParrotNearDogReturnNeighbourtypeCat() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT_NEAR_CAT);
        assertEquals(NeighbourTypeEnum.CAT, ((Parrot) result).getNeighbourType());
    }

    @Test
    public void whenParrotNearDogReturnNeighbourtypeDuck() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT_NEAR_DUCK);
        assertEquals(NeighbourTypeEnum.DUCK, ((Parrot) result).getNeighbourType());
    }

    @Test
    public void whenParrotNearDogReturnNeighbourtypeRooster() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT_NEAR_ROOSTER);
        assertEquals(NeighbourTypeEnum.ROOSTER, ((Parrot) result).getNeighbourType());
    }

    @Test
    public void whenParrotNearDogReturnNeighbourtypePhone() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.PARROT_NEAR_PHONE);
        assertEquals(NeighbourTypeEnum.PHONE, ((Parrot) result).getNeighbourType());
    }


}
