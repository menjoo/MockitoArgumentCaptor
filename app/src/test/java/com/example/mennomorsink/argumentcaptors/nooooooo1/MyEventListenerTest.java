package com.example.mennomorsink.argumentcaptors.nooooooo1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyEventListenerTest {

    private MyEventListener systemUnderTest;

    private EventProducerMock eventProducer;

    @Before
    public void setUp() {
        eventProducer = new EventProducerMock();
        systemUnderTest = new MyEventListener(eventProducer);
    }

    @Test
    public void testChangesStateOnEvent()  {
        assertThat(systemUnderTest.getState(), is("initial state"));

        eventProducer.getListener().onEvent("sun is not shining!");

        assertThat(systemUnderTest.getState(), is("sun is not shining!"));
    }



    private class EventProducerMock extends EventProducer {
        private Listener listener;

        @Override
        public void addListener(Listener listener) {
            this.listener = listener;
        }

        public Listener getListener() {
            return listener;
        }
    }
}