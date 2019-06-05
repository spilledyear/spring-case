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

    @Bean("logService2")
    public LogService logService() {
        return new LogService();
    }

    @Bean("logAspect2")
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
