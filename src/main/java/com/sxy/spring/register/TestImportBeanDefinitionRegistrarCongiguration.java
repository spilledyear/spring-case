package com.sxy.spring.register;

import com.sxy.spring.register.imports.TestImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestImportBeanDefinitionRegistrar.class)
public class TestImportBeanDefinitionRegistrarCongiguration {
}
