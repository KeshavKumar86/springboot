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
/*
3. Using Annotation:

To provide the facility to the created bean to invoke custom init() method on the startup of a spring
container and to invoke the custom destroy() method on closing the container, we need to annotate
init() method by @PostConstruct annotation and destroy() method by @PreDestroy annotation.
 */