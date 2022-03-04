package com.designpattern.chainOfResponsibility;

public class BaseHandler implements Handler {
	
	protected Handler next;

	@Override
	public void setNext(Handler handler) {
		this.next = handler;
	}

	@Override
	public void handle() {
		if(next != null) {
			next.handle();
		}
	}

}
