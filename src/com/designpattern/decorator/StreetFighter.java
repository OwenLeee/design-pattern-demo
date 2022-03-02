package com.designpattern.decorator;

public interface StreetFighter {
	
	public void attack(StreetFighter streetfighter);
	
	public void defence(int power);
	
	public int getPower();

}
