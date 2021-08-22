package com.singtel.assignment.fish;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.animal.fish.ClownFish;
import com.singtel.assignment.animal.fish.Fish;
import com.singtel.assignment.utils.AnimalTypeEnum;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClownFishTest {
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
    public void isClownFishIsAFish() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertTrue(result instanceof Fish);
    }

    @Test
    public void whenTypeEqualsClownFishReturnClownFish() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertTrue(result instanceof ClownFish);
    }

    @Test
    public void canClownFishSwim() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertTrue(result instanceof ISwimmable);
    }

    @Test
    public void canClownFishMakeJokes() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertTrue(result instanceof IJokable);
    }

    @Test
    public void isClownFishSmall() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertEquals(Size.SMALL, ((ClownFish) result).getSize());
    }

    @Test
    public void isClownFishOrangeColored() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertEquals(Color.ORANGE, ((ClownFish) result).getColor());
    }

    @Test
    public void clownFishIsnotCarnivouros() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
        assertTrue(!(result instanceof ICarnivouros));
    }
}
