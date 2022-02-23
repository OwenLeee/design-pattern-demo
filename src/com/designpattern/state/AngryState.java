package com.designpattern.state;

public class AngryState extends State{

	public AngryState(Girlfriend girlfriend) {
		super(girlfriend);
	}

	@Override
	public void sayHello() {
		System.out.println("Hello??! What are you doing?");
	}

	@Override
	public void textMe() {
		System.out.println("I'm very disappointed to you!");
	}

	@Override
	public void facialExpression() {
		System.out.println("!_!");
	}
	
	@Override
	public void getState() {
		System.out.println("This is Angry State!");
	}

	
}
