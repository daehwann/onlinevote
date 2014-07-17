package com.daehwan.vote;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daehwan.vote.Greeting;

@RestController
public class VoteController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting2")
	public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
