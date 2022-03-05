package com.designpattern.prototype;

public abstract class Gun {

	public int length;
	public int weight;
	public int noOfBullets;

	public Gun() {

	};

	public Gun(Gun gun) {
		if (gun != null) {
			this.length = gun.length;
			this.weight = gun.weight;
			this.noOfBullets = gun.noOfBullets;
		}
	}

	public abstract Gun clone();

}
