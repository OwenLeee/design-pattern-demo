package com.designpattern.strategy;

public class RelaxStrategy implements TransportationStrategy {

	@Override
	public void goToWork() {
		System.out.println("Relax way! Take a Ferry!!");
	}

}
