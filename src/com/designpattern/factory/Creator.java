package com.designpattern.factory;

public abstract class Creator {
	
	public void waterFlower(){
		Flower f = createFlower();
		f.beingWater();
	}
	
	abstract Flower createFlower();

}
