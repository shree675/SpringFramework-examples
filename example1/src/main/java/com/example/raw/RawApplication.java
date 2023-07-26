package com.example.raw;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.raw.service.MessageService;

@SpringBootApplication
public class RawApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RawApplication.class, args);

		/*
		 * to list all the beans
		 */
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}

		MessageService messageService = context.getBean(MessageService.class);
		messageService.sendMessage();
	}

}
