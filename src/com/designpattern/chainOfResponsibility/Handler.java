package com.designpattern.chainOfResponsibility;

public interface Handler {
	
	public void setNext(Handler handler);
	
	public void handle();

}
