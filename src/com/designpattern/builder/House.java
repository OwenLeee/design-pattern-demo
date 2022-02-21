package com.designpattern.builder;

public class House {
	
	private int windows;
	private int balcony;
	private int airConditioner;
	private int heater;
	
	public int getWindows() {
		return windows;
	}
	public void setWindows(int windows) {
		this.windows = windows;
	}
	public int getBalcony() {
		return balcony;
	}
	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}
	public int getAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(int airConditioner) {
		this.airConditioner = airConditioner;
	}
	public int getHeater() {
		return heater;
	}
	public void setHeater(int heater) {
		this.heater = heater;
	}
	
}
