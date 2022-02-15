package com.designpattern.abstractFactory;

public class AppleFactory implements TechFactory {

	@Override
	public Smartphone createSmartphone() {
		return new Iphone();
	}

	@Override
	public Notebook createNotebook() {
		return new Macbook();
	}

}
