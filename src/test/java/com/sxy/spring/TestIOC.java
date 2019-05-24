package com.sxy.spring;

import com.sxy.spring.register.ExternalBean;
import com.sxy.spring.register.TestBeanConfiguration;
import com.sxy.spring.register.TestImportBeanDefinitionRegistrarCongiguration;
import com.sxy.spring.register.TestImportConfiguration;
import com.sxy.spring.register.TestImportSelectConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestIOC {

    @Test
    public void testBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestBeanConfiguration.class);

        ExternalBean externalBean = (ExternalBean) context.getBean("externalBean2");
        System.out.println(externalBean);
    }

    @Test
    public void testProfile() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestBeanConfiguration.class);

        ExternalBean externalBean = (ExternalBean) context.getBean("externalBean10");
        System.out.println(externalBean);
    }


    @Test
    public void testImport() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestImportConfiguration.class);

        ExternalBean externalBean = context.getBean(ExternalBean.class);
        System.out.println(externalBean);
    }


    @Test
    public void testImportSelect() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestImportSelectConfiguration.class);

        ExternalBean externalBean = context.getBean(ExternalBean.class);
        System.out.println(externalBean);
    }


    @Test
    public void testTestImportBeanDefinitionRegistrar() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestImportBeanDefinitionRegistrarCongiguration.class);

        ExternalBean externalBean = context.getBean(ExternalBean.class);
        ExternalBean externalBean2 = (ExternalBean) context.getBean("externalBean");
        System.out.println(externalBean);
        System.out.println(externalBean2);
    }
}
