package com.designpattern.factory;

public class ConcreteCreatorRed extends Creator{
	
	public Flower createFlower() {
		return new RedFlower();
	}
}
