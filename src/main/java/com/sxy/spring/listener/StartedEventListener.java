package com.sxy.spring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

@Slf4j
public class StartedEventListener implements ApplicationListener<StartedEvent> {
    @Override
    public void onApplicationEvent(StartedEvent event) {
        log.info("StartedEvent");
        log.info(event.toString());
    }
}
