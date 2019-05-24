package com.sxy.spring.register;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.sxy.spring.register")
public class TestProfileConfiguration {

    @Profile("default")
    @Bean("externalBean10")
    public ExternalBean externalBean() {
        return new ExternalBean();
    }
}
