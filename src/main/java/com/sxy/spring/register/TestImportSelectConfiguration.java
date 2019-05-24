package com.sxy.spring.regist;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestImportSelect.class)
public class TestImportSelectConfiguration {
}
