package com.sxy.spring.context;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:/test.properties"})
public class Proterty {
    @Value("${name}")
    private String name;
}
