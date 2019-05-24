package com.sxy.spring.register;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ExternalBean.class)
public class TestImportConfiguration {
}
