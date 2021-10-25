package br.com.fortune.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fortune.response.FortuneResponse;
import br.com.fortune.service.FortuneService;

@RestController
public class FortuneController {
	
	@Autowired
	private FortuneService service;
	
	@GetMapping(path="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FortuneResponse> getFortune(){
		
		FortuneResponse response = new FortuneResponse();
		response.setMessage(service.getMessage());
		response.setNumbers(service.getNumbers());
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
