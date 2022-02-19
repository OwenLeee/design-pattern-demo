package com.designpattern.observer;

public class EmailNotificationListener implements NotificationListeners {

	private String name;

	public EmailNotificationListener(String name) {
		this.name = name;
	}

	@Override
	public void push(String msg) {
		System.out.println(name + " Email received an email! Content: " + msg);
	}

}
