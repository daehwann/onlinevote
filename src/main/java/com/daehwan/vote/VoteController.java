package com.daehwan.vote;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting2")
	public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	//투표용 URL
	@RequestMapping("/vote")
	public Opinion vote(HttpServletRequest request, @RequestParam(value="opinion", required=true) boolean opinion) throws UnknownHostException{
		String ip = InetAddress.getLocalHost().getHostAddress();
		System.out.println("host ip address : " + ip);
		Opinion newOpinion = new Vote().doVote(request.getRemoteAddr(), opinion);
		System.out.println("New Opinion : " + newOpinion.toString());
		return newOpinion; 
	}
	
}
