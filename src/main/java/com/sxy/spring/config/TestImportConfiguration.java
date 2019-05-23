package com.sxy.spring.config;

import com.sxy.spring.bean.ExternalBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ExternalBean.class)
public class TestImportConfiguration {
}
