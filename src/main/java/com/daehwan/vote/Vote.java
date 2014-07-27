package com.daehwan.vote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Vote {
	
	public List<Voter> voterList = new ArrayList<Voter>();
	
	public Set<String> keySet = new HashSet<String>();
	
	public List<Voter> getVoterList(){
		return this.voterList;
	}
	
	public String doVote(Voter voter) {
		String message = "";
		
		if(hasVoted(voter)){
			message = "You have already voted!";
			System.out.println("You have already voted!");
		}else {
			voterList.add(voter);
			message = "Thank you for you vote";
			System.out.println("Thank you for you vote");
		}
		return message;
		
	}
	
	public boolean hasVoted(Voter voter) {
		for(Voter v : voterList) {
			if(v.getKey().equals(voter.getKey())) {
				return true;
			}
		}
		return false;
	}
}
