package com.designpattern.decorator;

public class DefensiveFighterDecorator extends FighterDecorator{

	public DefensiveFighterDecorator(StreetFighter streetFighter) {
		super("DefensiveFighterDecorator", 100, 10, 1000, streetFighter);
	}

	@Override
	public void specialAttack(StreetFighter streetFighter) {
		super.specialAttack(streetFighter);
	}
	
}
