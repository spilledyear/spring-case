package com.sxy.spring;

import com.sxy.spring.context.TestImportSelect;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(ExternalBean.class)
@Import(TestImportSelect.class)
public class SpringCaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCaseApplication.class, args);
    }
}
