package com.example.web;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import com.example.web.controller.Controller;

@SpringBootTest
@ActiveProfiles("test") // required for H2 testing
@AutoConfigureMockMvc
/*
 * do not test on application.properties,
 * use a separate database for testing
 */
@TestPropertySource(locations = { "file:src/test/resources/application-test.properties" })
class WebApplicationTests {

	@Autowired
	private Controller userController;

	@Test
	void contextLoads() {
		assertNotNull(userController);
	}

}
