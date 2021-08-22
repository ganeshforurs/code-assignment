package com.singtel.assignment.bird;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.animal.bird.Duck;
import com.singtel.assignment.utils.AnimalTypeEnum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertTrue;

@SpringBootTest
public class DuckTest {
    AnimalFactory animalFactory = null;

    @org.junit.jupiter.api.Test
    void contextLoads() {
    }

    @Before
    public void setUp() {
        animalFactory = new AnimalFactory();
    }

    @After
    public void clear() {
        animalFactory = null;
    }


    @Test
    public void whenTypeEqualsDuckReturnDuck() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DUCK);
        assertTrue(result instanceof Duck);
    }


    @Test
    public void canDuckSing() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DUCK);
        assertTrue(result instanceof ISingable);
    }

    @Test
    public void canDuckWalk() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DUCK);
        assertTrue(result instanceof IWalkable);
    }

    @Test
    public void canDuckSwim() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DUCK);
        assertTrue(result instanceof ISwimmable);
    }

    @Test
    public void duckCannotFly() {
        IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.DUCK);
        assertTrue(!(result instanceof IFlyable));
    }


}
