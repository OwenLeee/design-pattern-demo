package com.designpattern.abstractFactory;

public class SamsungFactory implements TechFactory {

	@Override
	public Smartphone createSmartphone() {
		return new SamsungNote();
	}

	@Override
	public Notebook createNotebook() {
		return new SamsungGalaxyBook();
	}

}
