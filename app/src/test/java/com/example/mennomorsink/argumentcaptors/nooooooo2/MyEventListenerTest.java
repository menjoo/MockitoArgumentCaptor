package com.example.mennomorsink.argumentcaptors.nooooooo2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyEventListenerTest {

    private MyEventListener systemUnderTest;

    @Mock
    private EventProducer eventProducer;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        systemUnderTest = new MyEventListener(eventProducer);
    }

    @Test
    public void testChangesStateOnEvent()  {
        assertThat(systemUnderTest.getState(), is("initial state"));

        systemUnderTest.onEvent("sun is not shining!");

        assertThat(systemUnderTest.getState(), is("sun is not shining!"));
    }
}