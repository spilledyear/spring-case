package com.sxy.spring.config;

import com.sxy.spring.context.TestImportSelect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestImportSelect.class)
public class TestImportSelectConfiguration {
}
