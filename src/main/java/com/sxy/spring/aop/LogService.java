package com.sxy.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogService {
    private Logger logger = LoggerFactory.getLogger(LogService.class);

    public void sayHello() {
        logger.warn("Hello");
    }

}
