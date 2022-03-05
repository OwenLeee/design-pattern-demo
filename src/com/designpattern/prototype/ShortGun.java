package com.designpattern.prototype;

public class ShortGun extends Gun{
	
	public int length;
	public int weight;
	public int noOfBullets;
	
	public ShortGun() {
		
	}

	public ShortGun(ShortGun gun) {
		super(gun);
		if(gun != null) {
			this.length = gun.length;
			this.weight = gun.weight;
			this.noOfBullets = gun.noOfBullets;
		}
	}

	@Override
	public Gun clone() {
		return new ShortGun(this);
	}

	@Override
	public String toString() {
		return "ShortGun [length=" + length + ", weight=" + weight + ", noOfBullets=" + noOfBullets + "]";
	}
	
	

}
