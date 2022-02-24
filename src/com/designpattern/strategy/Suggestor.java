package com.designpattern.strategy;

public class Suggestor {

	private TransportationStrategy transportationStrategy;

	public void setTransportationStrategy(TransportationStrategy transportationStrategy) {
		this.transportationStrategy = transportationStrategy;
	}

	public void goToWorkSuggestion() {
		transportationStrategy.goToWork();
	}
}
