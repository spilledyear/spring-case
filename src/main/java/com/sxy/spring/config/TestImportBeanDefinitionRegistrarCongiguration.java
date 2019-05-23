package com.sxy.spring.config;

import com.sxy.spring.context.TestImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestImportBeanDefinitionRegistrar.class)
public class TestImportBeanDefinitionRegistrarCongiguration {
}
