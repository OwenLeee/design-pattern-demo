package com.designpattern.observer;

public class MarketingOperator {

	private MessageManager messageManager;

	public MarketingOperator(MessageManager messageManager) {
		this.messageManager = messageManager;
	}

	public void sendSmsMsg(String msg) {
		messageManager.toNotify(SubscriptionType.SMS, msg);
	}

	public void sendEmailMsg(String msg) {
		messageManager.toNotify(SubscriptionType.EMAIL, msg);
	}

}
