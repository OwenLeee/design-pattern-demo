package com.designpattern.chainOfResponsibility;

public class SecondHandler extends BaseHandler {
	
	public void handle() {
		System.out.println("SecondHandler");
		super.handle();
	}
	
}
