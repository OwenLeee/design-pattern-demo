package com.designpattern.decorator;

public class DefaultFighter implements StreetFighter {
	
	private String name;
	private int hp;
	private int power;
	private int defence;

	public DefaultFighter(String name) {
		this.name = name;
		this.hp = 100;
		this.power = 10;
		this.defence = 10;
	}

	@Override
	public void attack(StreetFighter streetFighter) {
		System.out.println(name + " attack with "+ power + " power point!");
		streetFighter.defence(power);
	}

	@Override
	public void defence(int power) {
		if (hp > 0) {
			if (defence < power) {
				int netPower = power - defence;
				int netHp = hp - netPower;
				hp = netHp >= 0 ? netHp : 0;
				System.out.println(name + " get hitted by " + netPower + " point power "+ ", remain hp : "+ hp); 
			} else {
				System.out.println(name + " with "+ defence + " defence point success defence");
			}
		}

		if (hp == 0) {
			System.out.println(name + " is dead already!");
		}
	}
	
	public int getPower() {
		return this.power;
	}

}
