package com.sxy.spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

@Slf4j
public class StartedEvent extends ApplicationEvent {
    public StartedEvent(Object source) {
        super(source);
    }
}
