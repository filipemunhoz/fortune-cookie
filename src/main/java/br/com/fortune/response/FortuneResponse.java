package br.com.fortune.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FortuneResponse {

	private String message;
	private List<Integer> numbers;
}