package com.designpattern.strategy;

public class CheapestStrategy implements TransportationStrategy {

	@Override
	public void goToWork() {
		System.out.println("The cheapest way! By Walk!!");
	}

}
