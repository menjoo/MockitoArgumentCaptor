package com.example.mennomorsink.argumentcaptors.no2;

class MyEventListener implements EventProducer.Listener {

    private EventProducer eventProducer;

    private String myState = "initial state";

    MyEventListener(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
        eventProducer.addListener(this);
    }

    @Override
    public void onEvent(String event) {
        myState = event;
    }

    String getState() {
        return myState;
    }
}
