package com.example.ticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticket.model.dto.HealthResponseDto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class HealthController {

	@GetMapping("/healthcheck")
	public ResponseEntity<HealthResponseDto> healthcheck() {
		HealthResponseDto response = HealthResponseDto.builder().status("Ok").build();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
