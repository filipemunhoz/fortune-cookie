package br.com.fortune.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fortune.repository.FortuneRepository;

@Service
public class FortuneService {
	
	private static int MIN_VALUE = 1;
	private static int MAX_VALUE = 61;
	
	@Autowired
	private FortuneRepository repository;
	
	public String getMessage() {

		int listSize = repository.getMessages().size();
		int randomElementIndex = ThreadLocalRandom.current().nextInt(listSize) % repository.getMessages().size();
		
		return repository.getMessages().get(randomElementIndex);
	}
	
	public List<Integer> getNumbers(){
		
		return ThreadLocalRandom.current()
				.ints(MIN_VALUE , MAX_VALUE)
				.distinct()
				.limit(6)
				.boxed()
				.sorted()
				.collect(Collectors.toList());
	}
}
