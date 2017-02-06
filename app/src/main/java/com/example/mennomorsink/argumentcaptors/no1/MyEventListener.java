package com.example.mennomorsink.argumentcaptors.no1;


class MyEventListener {

    private EventProducer eventProducer;

    private String myState = "initial state";

    MyEventListener(EventProducer eventProducer) {
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

    String getState() {
        return myState;
    }
}
