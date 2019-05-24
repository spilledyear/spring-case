package com.sxy.spring.register;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

public class TestFactoryBean implements FactoryBean<ExternalBean> {
    Logger logger = LoggerFactory.getLogger(TestFactoryBean.class);

    @Override
    public ExternalBean getObject() throws Exception {
        logger.warn("TestFactoryBean getObject方法");
        return new ExternalBean();
    }

    @Override
    public Class<?> getObjectType() {
        return ExternalBean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
