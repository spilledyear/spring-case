package com.sxy.spring.listener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * AbstractApplicationContext.refresh => finishRefresh()
 * ApplicationEventMulticaster
 */
@Configuration
public class ListenerConfiguration {

    @Bean
    public StartedEventListener startedEventListener() {
        return new StartedEventListener();
    }

    @Bean
    public AnnotationEventListener annotationEventListener() {
        return new AnnotationEventListener();
    }
}
