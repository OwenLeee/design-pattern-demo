package com.designpattern.builder;

public class CondoBuilder implements Builder {

	Condo condo;

	@Override
	public void reset() {
		this.condo = new Condo();
	}

	@Override
	public void setWindows(int num) {
		this.condo.setWindows(num);
	}

	@Override
	public void setBalcony(int num) {
		this.condo.setBalcony(num);
	}

	@Override
	public void setAirConditioner(int num) {
		this.condo.setAirConditioner(num);
	}

	@Override
	public void setHeater(int num) {
		this.condo.setHeater(num);
	}

	public Condo getProduct() {
		return this.condo;
	}

}
