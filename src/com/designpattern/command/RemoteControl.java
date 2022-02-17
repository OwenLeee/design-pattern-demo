package com.designpattern.command;

public class RemoteControl {
	public Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

}
