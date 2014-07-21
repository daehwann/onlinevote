package com.daehwan.vote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Vote {

	public static List<Opinion> opinionList = new ArrayList<Opinion>();
	public static Set<String> ipSet = new HashSet<String>();
	
	public Opinion doVote(String ip, boolean opinion) {
		Opinion o = new Opinion(ip, opinion);
		
		if(ipSet.add(o.getIp())){
			opinionList.add(o);
			System.out.println("Thank you for your vote!!");
			return o;
		}else {
			System.out.println("You have already voted!!");
			return o;
		}
	}
	
	public static void main(String[] args) {
		Opinion o1 = new Opinion("111.222.333.444", false);
		if(ipSet.add(o1.getIp())){
			opinionList.add(o1);
			System.out.println("Thank you for your vote!!");
		}else {
			System.out.println("you have already voted!!");
		}
		
		Opinion o2 = new Opinion("111.222.333.444", true);
		if(ipSet.add(o2.getIp())){
			opinionList.add(o2);
			System.out.println("Thank you for your vote!!");
		}else {
			System.out.println("you have already voted!!");
		}
		
		for(Opinion o : opinionList) {
			System.out.println(o.getIp());
		}
	}
}
