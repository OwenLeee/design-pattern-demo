package com.designpattern.state;

public abstract class State {

	protected Girlfriend girlfriend;

	public State(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
	}

	public abstract void sayHello();

	public abstract void textMe();

	public abstract void facialExpression();
	
	public abstract void getState();

}
