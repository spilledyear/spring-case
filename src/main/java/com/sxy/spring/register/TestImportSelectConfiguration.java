package com.sxy.spring.register;

import com.sxy.spring.register.imports.TestImportSelect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TestImportSelect.class)
public class TestImportSelectConfiguration {
}
