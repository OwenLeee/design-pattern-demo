package com.designpattern.builder;

public interface Builder {
	
	public void reset();
	
	public void setWindows(int num);
	
	public void setBalcony(int num);
	
	public void setAirConditioner(int num);
	
	public void setHeater(int num);
}
