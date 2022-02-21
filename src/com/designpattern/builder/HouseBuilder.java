package com.designpattern.builder;

public class HouseBuilder implements Builder {

	private House house;

	@Override
	public void reset() {
		this.house = new House();
	}

	@Override
	public void setWindows(int num) {
		this.house.setWindows(num);
	}

	@Override
	public void setBalcony(int num) {
		this.house.setBalcony(num);
	}

	@Override
	public void setAirConditioner(int num) {
		this.house.setAirConditioner(num);
	}

	@Override
	public void setHeater(int num) {
		this.house.setHeater(num);
	}
	
	public House getProduct() {
		return this.house;
	}

}
