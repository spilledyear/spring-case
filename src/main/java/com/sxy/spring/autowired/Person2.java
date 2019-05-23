package com.sxy.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person2 {
    private Car cat;


    // 标记在set方法上
    @Autowired
    public void setCat(Car cat) {
        this.cat = cat;
    }

//    // 效果和上面的是一样的
//    public void setCat(@Autowired Car cat) {
//        this.cat = cat;
//    }

    public Car getCat() {
        return cat;
    }
}
