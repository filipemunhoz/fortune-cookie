package br.com.fortune.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import br.com.fortune.response.FortuneResponse;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FortuneControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private FortuneController controller;
	
	@Test
	@RepeatedTest(50)
	void getFortuneResponse()  throws Exception {
	    
		mockMvc.perform(get("/"))
        	.andExpect(status().isOk());
		
		ResponseEntity<FortuneResponse> response = controller.getFortune();
		
		String message = response.getBody().getMessage();
		List<Integer> numbers = response.getBody().getNumbers();
		
	    assertThat(message).isNotNull();
	    assertThat(message).isNotEmpty();
	    assertThat(message.length()).isGreaterThan(0);
	    
	    assertThat(numbers).isNotNull();
	    assertThat(numbers.size()).isEqualTo(6);
	    assertThat(numbers.size()).isEqualTo(numbers.stream().distinct().collect(Collectors.toList()).size());
	    assertThat(Collections.min(numbers)).isGreaterThan(0);
	    assertThat(Collections.max(numbers)).isLessThan(61);	    
	}
}
