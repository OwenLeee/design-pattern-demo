package com.designpattern.state;

public class NormalState extends State{

	public NormalState(Girlfriend girlfriend) {
		super(girlfriend);
	}

	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void textMe() {
		System.out.println("Yo!");
	}

	@Override
	public void facialExpression() {
		System.out.println("0_0");
	}

	@Override
	public void getState() {
		System.out.println("This is Normal State!");
	}
	
}
