package com.designpattern.adaptor;

public class ConsumerClient {

	public boolean consumeData(NewDataFormat data) {
		return data.getNewData() instanceof String;
	}

}
