package com.designpattern.observer;

public class SmsNotificationListener implements NotificationListeners {

	private String name;

	public SmsNotificationListener(String name) {
		this.name = name;
	}

	@Override
	public void push(String msg) {
		System.out.println(name + " Iphone received a sms! Msg: " + msg);
	}

}
