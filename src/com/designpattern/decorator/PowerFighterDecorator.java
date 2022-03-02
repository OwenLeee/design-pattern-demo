package com.designpattern.decorator;

public class PowerFighterDecorator extends FighterDecorator{

	public PowerFighterDecorator(StreetFighter streetFighter) {
		super("PowerFighterDecorator", 10, 2000, 1, streetFighter);
	}

	@Override
	public void specialAttack(StreetFighter streetFighter) {
		super.specialAttack(streetFighter);		
	}
	
	
}
