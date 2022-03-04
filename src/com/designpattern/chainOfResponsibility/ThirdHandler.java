package com.designpattern.chainOfResponsibility;

public class ThirdHandler extends BaseHandler {
	
	public void handle() {
		System.out.println("ThridHandler");
		super.handle();
	}
	
}
