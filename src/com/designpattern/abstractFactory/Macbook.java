package com.designpattern.abstractFactory;

public class Macbook implements Notebook {

	@Override
	public void monitorSize() {
		System.out.println("I got a retina display");
	}

	@Override
	public void cpuSpeed() {
		System.out.println("I'm using M1 max core, no one can beat me");
	}

}
