package com.designpattern.state;

public class Girlfriend {

	private State state;

	private boolean isBusy;

	public Girlfriend() {
		this.state = new NormalState(this);
		this.isBusy = false;
	}

	private void changeState(State state) {
		this.state = state;
	}

	public void goToShoppoing() {
		this.changeState(new HappyState(this));
		System.out.println("goToShoppoing");
		state.getState();
		state.sayHello();
		state.textMe();
		state.facialExpression();
		System.out.println("--------------------------");
	}

	public void getHungry() {
		this.changeState(new AngryState(this));
		System.out.println("getHungry");
		state.getState();
		state.sayHello();
		state.textMe();
		state.facialExpression();
		System.out.println("--------------------------");
	}

	public void listenAJoke() {
		if (this.isBusy) {
			this.changeState(new NormalState(this));
		} else {
			this.changeState(new HappyState(this));

		}
		System.out.println("listenAJoke");
		state.getState();
		state.sayHello();
		state.textMe();
		state.facialExpression();
		System.out.println("--------------------------");
	}

	public void goToWork() {
		this.setBusy(true);
		System.out.println("goToWork");
		System.out.println("--------------------------");
	}

	public void offWork() {
		this.setBusy(false);
		System.out.println("offWork");
		System.out.println("--------------------------");
	}

	public boolean isBusy() {
		return isBusy;
	}

	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

}
