package com.sxy.spring.config;

import com.sxy.spring.bean.ExternalBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sxy.spring")
public class TestBeanConfiguration {

    @Bean("externalBean2")
    public ExternalBean externalBean() {
        return new ExternalBean();
    }
}
