package com.designpattern.abstractFactory;

public class SamsungGalaxyBook implements Notebook {

	@Override
	public void monitorSize() {
		System.out.println("I got a 14 inch monitor");
	}

	@Override
	public void cpuSpeed() {
		System.out.println("I'm using Intel CPU");
	}

}
