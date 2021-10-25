package br.com.fortune.response;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FortuneResponse {

	private String message;
	private List<Integer> numbers;
}