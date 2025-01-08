package com.keshav.springxmlconfigpractice;

import com.keshav.springxmlconfigpractice.bean.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringxmlconfigpracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringxmlconfigpracticeApplication.class, args);
        System.out.println(System.getProperty("java.class.path"));
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println("Employee: " + employee);
    }

}
/*
Types of ApplicationContext:
ClassPathXmlApplicationContext - Loads configuration from XML file in the classpath.
FileSystemXmlApplicationContext - Loads configuration from an XML file in the filesystem.
AnnotationConfigApplicationContext - Reads configuration from annotated classes.
WebApplicationContext - Specialized for web applications.

The classpath in a Spring Boot application (or any Java application) refers to the set of directories,
JAR files, and other resources that the Java Virtual Machine (JVM) uses to locate and load classes,
resources, and configuration files during runtime.

In the context of a Spring Boot application, the classpath plays a critical role in determining how
the application finds its dependencies, configuration files, and other resources.
 */