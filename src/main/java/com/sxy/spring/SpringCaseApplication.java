package com.sxy.spring;

import com.sxy.spring.context.TestFactoryBean;
import com.sxy.spring.context.TestImportBeanDefinitionRegistrar;
import com.sxy.spring.context.TestImportSelect;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

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
