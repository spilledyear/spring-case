package com.sxy.spring;

import com.sxy.spring.aop.AopConfiguration;
import com.sxy.spring.aop.LogService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAOP {
    @Test
    public void testProfile() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfiguration.class);

        LogService logService = context.getBean(LogService.class);
        logService.sayHello();
    }
}
