package com.sxy.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AnnotationAwareAspectJAutoProxyCreator
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfiguration {

    @Bean
    public LogService logService() {
        return new LogService();
    }

    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
