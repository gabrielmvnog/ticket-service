package com.example.ticket.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import com.example.ticket.service.TicketService;

@SpringBootTest
@AutoConfigureMockMvc
public class TicketControllerTest {
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private TicketService ticketService;
	
	@Test
	public void givenRequest_whenServiceIsOk_thenShouldReturnOk() throws Exception {				
		MockHttpServletResponse response = mvc.perform(post("/tickets")).andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.CREATED.value());
	}

}
