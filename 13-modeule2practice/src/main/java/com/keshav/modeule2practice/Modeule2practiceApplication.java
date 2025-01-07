package com.keshav.modeule2practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {
				"com.keshav.modeule2practice",
				"util"
		}
)
public class Modeule2practiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Modeule2practiceApplication.class, args);
	}

}
