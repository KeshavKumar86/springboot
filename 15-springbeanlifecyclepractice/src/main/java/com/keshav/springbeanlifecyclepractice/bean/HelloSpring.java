package com.keshav.springbeanlifecyclepractice.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

public class HelloSpring implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("Container has been closed and I am the destroy() method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean HelloSpring has been instantiated and I am the init()" +
                "method");
    }
}
/*
2. By Programmatic Approach:
To provide the facility to the created bean to invoke custom init() method on the startup of a
spring container and to invoke the custom destroy() method on closing the container, we need to
implement our bean with two interfaces namely InitializingBean, DisposableBean and will have to
override afterPropertiesSet() and destroy() method. afterPropertiesSet() method is invoked as the
container starts and the bean is instantiated whereas, the destroy() method is invoked just after
the container is closed.

Note: To invoke destroy method we have to call a close() method of ConfigurableApplicationContext.
 */