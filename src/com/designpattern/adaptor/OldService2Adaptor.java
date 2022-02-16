package com.designpattern.adaptor;

public class OldService2Adaptor extends NewDataFormat {

	public OldService2 oldService2;

	public OldService2Adaptor(OldService2 oldService2) {
		this.oldService2 = oldService2;
	}

	public String getNewData() {
		return String.valueOf(oldService2.getData());
	}

}
