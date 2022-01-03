package com.rsr.flow.check;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rsr.flow")
public class SpringFlowCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFlowCheckApplication.class, args);
	}

}
