package com.designpattern.prototype;

public class MachineGun extends Gun{
	
	public int length;
	public int weight;
	public int noOfBullets;
	
	public MachineGun () {};
	
	public MachineGun(MachineGun gun) {
		super(gun);
		if(gun != null) {
			this.length = gun.length;
			this.weight = gun.weight;
			this.noOfBullets = gun.noOfBullets;
		}
	}

	@Override
	public Gun clone() {
		return new MachineGun(this);
	}

	@Override
	public String toString() {
		return "MachineGun [length=" + length + ", weight=" + weight + ", noOfBullets=" + noOfBullets + "]";
	}

	
}
