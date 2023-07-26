package com.example.raw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RawApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RawApplication.class, args);

		/*
		 * does not override values in application.properties
		 */
		Person person = context.getBean(Person.class, "User x");
		printPersonDetails(person);

	}

	private static void printPersonDetails(Person person) {
		System.out.println(person.getName());
		System.out.println(person.getNum());
		System.out.println(person.getProp());
		System.out.println(person.isEnabled());

		for (String value : person.getValues()) {
			System.out.println(value);
		}
	}

}
