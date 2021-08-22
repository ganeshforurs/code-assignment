package com.singtel.assignment;

import com.singtel.assignment.animal.AnimalFactory;
import com.singtel.assignment.animal.IAnimal;
import com.singtel.assignment.animal.IFlyable;
import com.singtel.assignment.animal.IWalkable;
import com.singtel.assignment.animal.butterfly.ButterFlyState;
import com.singtel.assignment.animal.butterfly.Butterfly;
import com.singtel.assignment.utils.AnimalTypeEnum;
import com.singtel.assignment.utils.InsectStateEnum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ButterflyTest {

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
	public void isButterFLyStartWithCatterpillarState(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY);
		assertEquals(InsectStateEnum.CATERPILLAR, ((Butterfly) result).getState());
	}

	@Test
	public void whenCatterpillarcannotFly(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY);
		assertTrue(!(((Butterfly) result).getCurrentState() instanceof IFlyable));
	}

	@Test
	public void whenCatterpillarcanwalk(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY);
		assertTrue(((Butterfly) result).getCurrentState() instanceof IWalkable);
	}


	@Test
	public void whenCatterPillarTransformToButterFly(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY);
		((Butterfly) result).transform();
		assertTrue( ((Butterfly) result).getCurrentState() instanceof ButterFlyState);
	}


	@Test
	public void whenCatterPillarTransformToButterFlyCanFly(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY);
		((Butterfly) result).transform();
		assertTrue( ((Butterfly) result).getCurrentState() instanceof IFlyable);
	}



	@Test
	public void whenCatterPillarTransformToButterFlyCannotWalk(){
		IAnimal result = animalFactory.createAnimal(AnimalTypeEnum.BUTTERFLY);
		((Butterfly) result).transform();
		assertTrue( !(((Butterfly) result).getCurrentState() instanceof IWalkable));
	}

}
