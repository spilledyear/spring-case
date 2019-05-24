package com.sxy.spring.regist;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestImportBeanDefinitionRegistrar.class)
public class TestImportBeanDefinitionRegistrarCongiguration {
}
