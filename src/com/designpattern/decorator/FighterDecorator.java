package com.designpattern.decorator;

public abstract class FighterDecorator implements StreetFighter{
	
	protected String name;
	
	protected int addOnHp;
	
	protected int addOnPower;
	
	protected int addOnDefence;
	
	protected StreetFighter streetFighter;

	public FighterDecorator(String name, int addOnHp, int addOnPower, int addOnDefence, StreetFighter streetFighter) {
		this.name = name;
		this.addOnHp = addOnHp;
		this.addOnPower = addOnPower;
		this.addOnDefence = addOnDefence;
		this.streetFighter = streetFighter;
	}
	
	@Override
	public void attack(StreetFighter sf) {
		System.out.println(name + " attack with "+ streetFighter.getPower() + " power point!");
		sf.defence(streetFighter.getPower());
	}


	@Override
	public void defence(int power) {
		int netPower = power - this.addOnDefence;
		System.out.println(name + " with "+ addOnDefence + " addOnDefence point is hitted by " + power + " power point!");
		streetFighter.defence(netPower);
	}
	
	public void specialAttack(StreetFighter streetFighter) {
		if (streetFighter instanceof FighterDecorator) {
			FighterDecorator decoStreetFighter = (FighterDecorator) streetFighter;
			System.out.println(name + " special attack with "+ (addOnPower + streetFighter.getPower()) + " power point!");
			decoStreetFighter.defence(addOnPower + streetFighter.getPower());
		}
	};
	
	public int getPower() {
		return streetFighter.getPower() + addOnPower;
	}
}
