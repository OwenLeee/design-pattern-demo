package com.designpattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MessageManager {

	private HashMap<SubscriptionType, List<NotificationListeners>> listeners;

	public MessageManager() {
		this.listeners = new HashMap();
	}

	public void subscribe(SubscriptionType subscriptionType, NotificationListeners subscriber) {
		if (listeners.containsKey(subscriptionType)) {
			listeners.get(subscriptionType).add(subscriber);
		} else {
			listeners.computeIfAbsent(subscriptionType, k -> new ArrayList<>()).add(subscriber);
		}
	}

	public void unsubscribe(SubscriptionType subscriptionType, NotificationListeners subscriber) {
		if (listeners.containsKey(subscriptionType)) {
			listeners.get(subscriptionType).remove(subscriber);
		}
	}

	public void toNotify(SubscriptionType subscriptionType, String msg) {
		List<NotificationListeners> subscribers = listeners.get(subscriptionType);
		for (NotificationListeners subscriber : subscribers) {
			subscriber.push(msg);
		}
	}

}
