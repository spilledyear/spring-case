package com.sxy.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.sxy.spring.aop.LogService.sayHello(..))")
    public void pointcut() {

    }


    @Before("pointcut()")
    public void before() {
        logger.info("before");
    }

    @After("pointcut()")
    public void after() {
        logger.info("after");
    }

    /**
     * 如果 @Before 和 @Around 同时存在，@Before里面的逻辑不会执行
     */
//    @Around("pointcut()")
//    public void around(JoinPoint joinPoint) {
//        logger.info("around");
//    }

    /**
     * 目标方法正常返回的时候会执行
     */
    @AfterReturning("pointcut()")
    public void afterReturning() {
        logger.info("afterReturning");
    }


    /**
     * 目标方法发生异常的时候执行
     */
    @AfterThrowing("pointcut()")
    public void afterThrowing() {
        logger.info("afterThrowing");
    }
}
