package com.zensar.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {

	@Autowired //-->To enable autowiring for mockMvc test class must be annoted with
	private MockMvc mock; //MockMvc is a class given by spring mvc to do peform testing of spring controller
	@Test
	public void getmessageTest() throws Exception {
		mock.perform(MockMvcRequestBuilders.get("/hello"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Welcome"));
	}
	
	@Test
	public void createMessageTest() throws Exception {
		mock.perform(MockMvcRequestBuilders.post("/hello").content("Welcome"))
		.andExpect(MockMvcResultMatchers.status().isCreated())
		
		.andExpect(MockMvcResultMatchers.content().string("Message created Welcome"));
	}
	
}
