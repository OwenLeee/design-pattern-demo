package com.designpattern.state;

public class HappyState extends State{

	public HappyState(Girlfriend girlfriend) {
		super(girlfriend);
	}

	@Override
	public void sayHello() {
		if(girlfriend.isBusy()) {			
			System.out.println("Hello, I'm busy now, but I almost finised my work, happy!");
		}else {
			System.out.println("Hello, yeah! I'm very happy now!");
		}
	}

	@Override
	public void textMe() {
		System.out.println("Hey babe!");
	}

	@Override
	public void facialExpression() {
		System.out.println("^_^");
	}

	@Override
	public void getState() {
		System.out.println("This is Happy State!");
	}
}
