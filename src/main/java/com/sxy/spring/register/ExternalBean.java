package com.sxy.spring.register.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class ExternalBean implements InitializingBean, DisposableBean {
    Logger logger = LoggerFactory.getLogger(ExternalBean.class);
    // 执行顺序 Constructor > @PostConstruct > InitializingBean > init-method


    @Override
    public void afterPropertiesSet() throws Exception {
        logger.error("在Bean初始化之后执行 InitializingBean 的 afterPropertiesSet 方法");
    }

    @Override
    public void destroy() throws Exception {
        logger.error("在容器销毁之前执行 DisposableBean 的 destroy 方法");
    }

    @PostConstruct
    public void init() {
        logger.error("在Bean创建完成并且属性完成赋值时调用此方法，在afterPropertiesSet方法之前调用");
    }


    private Property property;

    @Autowired
    public void setProperty(Property property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return property.toString();
    }
}
