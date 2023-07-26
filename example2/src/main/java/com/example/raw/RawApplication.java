package com.example.raw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RawApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RawApplication.class, args);

		MainService mainService = context.getBean(MainService.class);
		/*
		 * will print "abc def"
		 */
		mainService.printNames();
	}

}
