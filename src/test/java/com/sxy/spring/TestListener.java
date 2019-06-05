package com.sxy.spring;

import com.sxy.spring.listener.ListenerConfiguration;
import com.sxy.spring.listener.StartedEvent;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestListener {
    @Test
    public void testProfile() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ListenerConfiguration.class);

        context.publishEvent(new StartedEvent("book"));
    }
}
