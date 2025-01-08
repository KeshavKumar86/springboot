package com.keshav.springbeanlifecyclepractice.bean;

public class HelloWorld {

    // This method executes
    // automatically as the bean
    // is instantiated(same like @PostConstruct)
    public void init() throws Exception{
        System.out.println("Bean HelloWorld has been instantiated and I am the init()" +
                "method");
    }
    // This method executes
    // when the spring container
    // is closed (same like @PreDestroy)
    public void destroy() throws Exception{
        System.out.println("Container has been closed and I am the destroy() method");
    }
}
/*
Spring provides three ways to implement the life cycle of a bean.
1. By XML: In this approach, in order to avail custom init() and destroy() methods for a bean we have
to register these two methods inside the Spring XML configuration file while defining a bean.

2.
 */
