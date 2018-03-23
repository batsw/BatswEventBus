package com.batsw.eb;

public class EventBusImpl extends EventBus{

	private static EventBusImpl mInstance;

	public static EventBusImpl getEventBus() {
		if (mInstance == null) {
			mInstance = new EventBusImpl();
		}
		return mInstance;
	}
}
