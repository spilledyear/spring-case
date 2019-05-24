package com.sxy.spring.register.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sxy.spring.register.bean")
public class TestBeanConfiguration {

    @Bean("externalBean2")
    public ExternalBean externalBean2() {
        return new ExternalBean();
    }
}
