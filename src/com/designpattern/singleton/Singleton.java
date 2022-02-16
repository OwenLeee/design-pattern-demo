package com.designpattern.singleton;

public class Singleton {

	private static Singleton signleton;

	private void Singleton() {}

	public static Singleton getInstance() {
		if (signleton == null) {
			signleton = new Singleton();
		}
		return signleton;
	}

}
