package br.com.fortune.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import br.com.fortune.repository.FortuneRepository;
import br.com.fortune.service.FortuneService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FortuneControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private FortuneService service;
	
	@Autowired
	private FortuneRepository repository;
	
	@Test
	void getFortuneResponse() throws Exception {
		
	    mockMvc.perform(get("/"))
	            .andExpect(status().isOk());
	    
	    List<String> messages = repository.getMessages();
	    String message = service.getMessage();
	    
	    assertThat(messages.size()).isGreaterThan(0);
	    assertThat(message).isNotNull();
	    assertThat(message.length()).isGreaterThan(0);
	}
	
	@Test
	@RepeatedTest(10)
	void getNumbers() {
		
		List<Integer> numbers = service.getNumbers();

	    assertThat(numbers).isNotNull();
	    assertThat(numbers.size()).isEqualTo(6);
	    assertThat(numbers.size()).isEqualTo(numbers.stream().distinct().collect(Collectors.toList()).size());
	}
}
