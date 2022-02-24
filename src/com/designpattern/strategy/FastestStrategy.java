package com.designpattern.strategy;

public class FastestStrategy implements TransportationStrategy {

	@Override
	public void goToWork() {
		System.out.println("The fastest way! Take taxi!!");
	}

}
