package com.example.mennomorsink.argumentcaptors.no1;

import java.util.List;

class EventProducer {

    private List<Listener> listenerList;

    void addListener(Listener listener) {
        listenerList.add(listener);
    }

    void removeListener(Listener listener) {
        listenerList.remove(listener);
    }

    interface Listener {
        void onEvent(String event);
    }
}
