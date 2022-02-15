package com.designpattern.abstractFactory;

public class Iphone implements Smartphone {

	@Override
	public void monitorResolution() {
		System.out.println("My resolution is 4k");
	}

	@Override
	public void isSupport5G() {
		System.out.println("Yes, i'm support 5G");
	}

}
