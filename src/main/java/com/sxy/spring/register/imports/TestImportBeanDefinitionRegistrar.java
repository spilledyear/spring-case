package com.sxy.spring.register.imports;

import com.sxy.spring.register.ExternalBean;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class TestImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 注册一个bean, 指定bean name
        registry.registerBeanDefinition("externalBean", new RootBeanDefinition(ExternalBean.class));
    }
}
