package com.singtel.assignment.animal.fish;


import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.animal.ISwimmable;
import com.singtel.assignment.utils.AnimalConstants;
import com.singtel.assignment.utils.AnimalTypeEnum;

public class Fish extends Animal implements ISwimmable {

	@Override
	public void swim() {
		{
			System.out.println(AnimalConstants.SWIMMING);
		}
	}
}
