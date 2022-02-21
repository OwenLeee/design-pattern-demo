package com.designpattern.builder;

public class Director {

	private Builder builder;

	public Director() {
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public void constructCondo() {
		builder.reset();
		builder.setWindows(3);
		builder.setBalcony(1);
		builder.setHeater(1);
		builder.setAirConditioner(1);
	}

	public void constructHouse() {
		builder.reset();
		builder.setWindows(10);
		builder.setBalcony(3);
		builder.setHeater(4);
		builder.setAirConditioner(4);
	}

}
