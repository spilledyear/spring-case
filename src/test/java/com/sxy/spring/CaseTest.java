package com.sxy.spring;

import com.sxy.spring.config.TestImportConfiguration;
import com.sxy.spring.context.ExternalBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CaseTest {

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestImportConfiguration.class);

        ExternalBean externalBean = context.getBean(ExternalBean.class);
        System.out.println(externalBean);
    }
}
