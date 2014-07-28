package com.daehwan.vote;

import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private ApplicationContext context = new AnnotationConfigApplicationContext(VoteConfig.class);

	@RequestMapping("/greeting2")
	public Greeting greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template,
				name));
	}

	// 투표용 URL
	@RequestMapping("/vote")
	public String vote(
			HttpServletRequest request,
			@RequestParam(value = "key", required = true) String key,
			@RequestParam(value = "opinion", required = true) boolean opinion)
			throws UnknownHostException {
		String ip = request.getRemoteAddr();
		System.out.println("voter key is : " + key);
		System.out.println("host ip address : " + ip);
		System.out.println("New Opinion : " + opinion);
		Voter newVoter = new Voter(key, ip, opinion);
		
		Vote vote = context.getBean(Vote.class);
		System.out.println("vote hash : " + vote.toString());
		for(Voter o : vote.voterList) {
			System.out.println(o.getKey() + ", ");
		}
		
		String message = vote.doVote(newVoter);
		
		return message;
	}

}
