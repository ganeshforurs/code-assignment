package com.singtel.assignment.animal.fish;

import com.singtel.assignment.animal.IJokable;
import com.singtel.assignment.utils.AnimalConstants;
import com.singtel.assignment.utils.Color;
import com.singtel.assignment.utils.Size;

public class ClownFish extends Fish implements IJokable{

	public ClownFish(){
		this.setColor(Color.ORANGE);
		this.setSize(Size.SMALL);
	}

	@Override public void joke() {
		System.out.println(AnimalConstants.JOKING);
	}
}
