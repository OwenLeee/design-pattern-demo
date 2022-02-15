package com.designpattern.abstractFactory;

public class SamsungNote implements Smartphone {

	@Override
	public void monitorResolution() {
		System.out.println("I got a 2k resolution monitor");
	}

	@Override
	public void isSupport5G() {
		System.out.println("No, I'm not supporting 5G");
	}

}
