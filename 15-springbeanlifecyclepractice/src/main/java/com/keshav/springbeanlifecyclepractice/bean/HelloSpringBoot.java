package com.keshav.springbeanlifecyclepractice.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class HelloSpringBoot {

    @PostConstruct
    public void someSetupStuff(){
        System.out.println("Spring boot PostConstruct method to setup the DB,File,Socket");
    }
    @PreDestroy
    public void SomeCleanupStuff(){
        System.out.println("Spring boot PreDestroy method to cleanup the DB,File,Socket");
    }
}
