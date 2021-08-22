package com.singtel.assignment.fish;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.animal.fish.Fish;
import com.singtel.assignment.animal.fish.Shark;
import com.singtel.assignment.utils.AnimalTypeEnum;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class SharkTest {
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
	public void isSharkIsAFish(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.SHARK);
		assertTrue(result instanceof Fish);
	}

	@Test
	public void whenTypeEqualsSharkReturnShark(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.SHARK);
		assertTrue(result instanceof Shark);
	}

	@Test
	public void canSharkSwim(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.SHARK);
		assertTrue(result instanceof ISwimmable);
	}

	@Test
	public void canClownFishMakeJokes(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.CLOWN_FISH);
		assertTrue(result instanceof IJokable);
	}

	@Test
	public void isSharkLarge(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.SHARK);
		assertEquals(Size.LARGE, ((Shark) result).getSize());
	}

	@Test
	public void isSharkGreyColored(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.SHARK);
		assertEquals(Color.GREY, ((Shark) result).getColor());
	}

	@Test
	public void sharkIsCarnivouros(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.SHARK);
		assertTrue(result instanceof ICarnivouros);
	}
}
