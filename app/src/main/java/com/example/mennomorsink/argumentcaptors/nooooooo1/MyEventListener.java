package com.example.mennomorsink.argumentcaptors.nooooooo1;

/**
 * Created by mennomorsink on 03/01/2017.
 */

public class MyEventListener {

    private EventProducer eventProducer;

    private String myState = "initial state";

    public MyEventListener(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
        registerForEvents();
    }

    private void registerForEvents() {
        eventProducer.addListener(new EventProducer.Listener() {
            @Override
            public void onEvent(String event) {
                myState = event;
            }
        });
    }

    public String getState() {
        return myState;
    }
}
