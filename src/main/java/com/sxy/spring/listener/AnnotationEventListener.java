package com.sxy.spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;

@Slf4j
public class AnnotationEventListener {

    @EventListener
    public void annotationEventListener(StartedEvent startedEvent) {
        log.warn("AnnotationEventListener");
        log.warn(startedEvent.toString());
    }
}
