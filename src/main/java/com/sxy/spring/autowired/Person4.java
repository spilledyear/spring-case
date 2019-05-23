package com.sxy.spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person4 {

    // 这里参数 car 会自动注入
    @Bean
    public Person person(Car car) {
        Person person = new Person();
        person.setCar(car);
        return person;
    }
}
