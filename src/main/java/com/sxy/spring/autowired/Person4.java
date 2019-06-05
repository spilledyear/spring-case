package com.sxy.spring.autowired;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;


//@ComponentScan  value:指定要扫描的包
//excludeFilters = Filter[] ：指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[] ：指定扫描的时候只需要包含哪些组件
//FilterType.ANNOTATION：按照注解
//FilterType.ASSIGNABLE_TYPE：按照给定的类型；
//FilterType.ASPECTJ：使用ASPECTJ表达式
//FilterType.REGEX：使用正则指定
//FilterType.CUSTOM：使用自定义规则

//@ComponentScans(
//        value = {
//                @ComponentScan(value = "com.sxy.spring", includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Person3.class}),
//                        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})
//                }, useDefaultFilters = false)
//        }
//)
@Configuration
@ComponentScan("com.sxy.spring.autowired")
public class Person4 {

    // 这里参数 car 会自动注入
    @Bean
    public Person person5(Car car) {
        Person person = new Person();
        person.setCar(car);
        return person;
    }
}
