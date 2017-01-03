package com.example.mennomorsink.argumentcaptors.nooooooo2;

import com.example.mennomorsink.argumentcaptors.nooooooo2.EventProducer;

/**
 * Created by mennomorsink on 03/01/2017.
 */

public class MyEventListener implements EventProducer.Listener {

    private EventProducer eventProducer;

    private String myState = "initial state";

    public MyEventListener(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
        eventProducer.addListener(this);
    }

    @Override
    public void onEvent(String event) {
        myState = event;
    }

    public String getState() {
        return myState;
    }
}
