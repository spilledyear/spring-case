package com.sxy.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person3 {
    private Car cat;

    // 标记在构造器上
    @Autowired
    public Person3(Car car) {
        this.cat = car;
    }

//    // 效果和上面的是一样的
//    public Person3(@Autowired Car car) {
//        this.cat = car;
//    }

//    // 效果和上面的是一样的。如果构造器只有一个参数，可以省略 @Autowired
//    public Person3(Car car) {
//        this.cat = car;
//    }


    public void setCat(Car cat) {
        this.cat = cat;
    }

    public Car getCat() {
        return cat;
    }
}
