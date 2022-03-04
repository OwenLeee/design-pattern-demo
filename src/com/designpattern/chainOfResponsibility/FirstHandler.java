package com.designpattern.chainOfResponsibility;

public class FirstHandler extends BaseHandler {
	
	public void handle() {
		System.out.println("FirstHandler");
		super.handle();
	}
	
}
