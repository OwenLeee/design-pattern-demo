package com.designpattern.factory;

public class ConcreteCreatorYellow extends Creator {
	public Flower createFlower() {
		return new YellowFlower();
	}
}
