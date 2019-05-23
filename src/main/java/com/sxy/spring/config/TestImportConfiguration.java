package com.sxy.spring.config;

import com.sxy.spring.context.ExternalBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ExternalBean.class)
public class TestImportConfiguration {
}
