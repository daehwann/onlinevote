package com.daehwan.vote;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoteConfig {
	
	@Bean
	public Vote vote(){
		return new Vote();
	}

}
