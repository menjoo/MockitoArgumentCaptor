package com.example.mennomorsink.argumentcaptors.yesssssss;

import com.example.mennomorsink.argumentcaptors.yesssssss.EventProducer;
import com.example.mennomorsink.argumentcaptors.yesssssss.MyEventListener;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

public class MyEventListenerTest {

    private MyEventListener systemUnderTest;

    @Mock
    private EventProducer eventProducer;

    @Captor
    private ArgumentCaptor<EventProducer.Listener> listenerArgumentCaptor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        systemUnderTest = new MyEventListener(eventProducer);
        verify(eventProducer).addListener(listenerArgumentCaptor.capture());
    }

    @Test
    public void testChangesStateOnEvent()  {
        assertThat(systemUnderTest.getState(), is("initial state"));

        listenerArgumentCaptor.getValue().onEvent("sun is not shining!");

        assertThat(systemUnderTest.getState(), is("sun is not shining!"));
    }
}