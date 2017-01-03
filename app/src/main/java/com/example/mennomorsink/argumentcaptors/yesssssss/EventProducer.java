package com.example.mennomorsink.argumentcaptors.yesssssss;

import java.util.List;

/**
 * Created by mennomorsink on 03/01/2017.
 */

public class EventProducer {

    private List<Listener> listenerList;

    public void addListener(Listener listener) {
        listenerList.add(listener);
    }

    public void removeListener(Listener listener) {
        listenerList.remove(listener);
    }

    interface Listener {
        void onEvent(String event);
    }
}
