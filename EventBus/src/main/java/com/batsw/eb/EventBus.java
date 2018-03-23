package com.batsw.eb;

import java.util.ArrayList;
import java.util.List;

import com.batsw.eb.event.Event;
import com.batsw.eb.listener.EventListener;

public abstract class EventBus {
	private List<EventListener> mEventListenersList = new ArrayList<>();

	public void addListenerToList(EventListener eventListener) {
		mEventListenersList.add(eventListener);
	}

	public void removeListenerFromList(EventListener eventListener) {
		if (mEventListenersList.contains(eventListener)) {
			mEventListenersList.remove(eventListener);
		}
	}

	public void triggerEvent(Event event) {
		for (EventListener el : mEventListenersList) {
			el.handleEvent(event);
		}
	}
}
