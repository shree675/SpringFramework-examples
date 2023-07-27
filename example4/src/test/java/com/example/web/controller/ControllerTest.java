package com.example.web.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.web.db.schema.User;

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
@TestPropertySource(locations = { "file:src/test/resources/application-test.properties" })
class ControllerTests {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mvc;

    @Test
    void insertOneUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/users").contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(new User(15, "username")))).andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    void getAllUsers() throws Exception {
        mvc.perform(MockMvcRequestBuilders
                .get("/users/all")
                .accept(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0]").isNotEmpty())
                .andExpect(MockMvcResultMatchers.jsonPath("$[1]").doesNotExist())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(15));

    }

}
