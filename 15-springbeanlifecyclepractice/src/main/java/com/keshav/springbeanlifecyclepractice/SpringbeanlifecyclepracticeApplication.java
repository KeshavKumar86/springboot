package com.keshav.springbeanlifecyclepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbeanlifecyclepracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbeanlifecyclepracticeApplication.class, args);

		// Loading the Spring XML configuration
		// file into the spring container and
		// it will create the instance of
		// the bean as it loads into container
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("beans.xml");

		// It will close the spring container
		// and as a result invokes the
		// destroy() method
		applicationContext.close();
	}

}
