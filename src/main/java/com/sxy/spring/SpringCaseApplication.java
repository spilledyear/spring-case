package com.sxy.spring;

import com.sxy.spring.register.context.TestFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@Import(ExternalBean.class)
//@Import(TestImportSelect.class)
//@Import(TestImportBeanDefinitionRegistrar.class)
public class SpringCaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCaseApplication.class, args);
    }

    @Bean
    public TestFactoryBean testFactoryBean() {
        return new TestFactoryBean();
    }
}
