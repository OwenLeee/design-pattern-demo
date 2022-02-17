package com.designpattern.command;

public class LightOnCommand implements Command {

	public Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.switchLightOn();
	}

}
