package com.sxy.spring.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 疑惑： 开启这个之后， @PostConstruct 定义的方法没有执行
 * <p>
 * spring底层对 BeanPostProcessor 的应用
 * 1. ApplicationContextAwareProcessor 注入容器
 * 2. InitDestroyAnnotationBeanPostProcessor 生命周期 @PostConstruct
 * 3. AutowiredAnnotationBeanPostProcessor 自动注入
 * ......
 */

@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    Logger logger = LoggerFactory.getLogger(TestBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("com.sxy.spring.bean.ExternalBean")) {
            logger.warn("Bean初始化之前调用 postProcessBeforeInitialization 方法");
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("com.sxy.spring.bean.ExternalBean")) {
            logger.warn("Bean初始化之后调用 postProcessAfterInitialization 方法");
        }
        return null;
    }
}
