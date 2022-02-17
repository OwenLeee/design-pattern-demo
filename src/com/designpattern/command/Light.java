package com.designpattern.command;

public class Light {

	public boolean isLightOn;

	public void switchLightOn() {
		this.isLightOn = true;
		System.out.println("The light is on!");
	}

	public void switchLightOff() {
		this.isLightOn = false;
		System.out.println("The light is off!");
	}

}
