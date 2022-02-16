package com.designpattern.adaptor;

public class OldServiceAdaptor extends NewDataFormat {

	public OldService oldService;

	public OldServiceAdaptor(OldService oldService) {
		this.oldService = oldService;
	}

	public String getNewData() {
		return String.valueOf(oldService.getData());
	}

}
