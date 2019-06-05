package com.sxy.spring.autowired;

import com.sxy.spring.bean.Person20;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;

@Configuration

public class MainConfig {

    //给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
    @Bean("person20")
    public Person20 person01() {
        return new Person20("lisi", 20);
    }

}
