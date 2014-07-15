package com.daehwan.vote;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Vote {

	public static Set<Opinion> set = new HashSet<Opinion>();
	public static Set<String> strSet = new HashSet<String>();
	public static void main(String[] args) {
//		Opinion o1 = new Opinion();
//		o1.setIp("111.222.333.444");
//		o1.setOpinion(true);
//		
//		Opinion o2 = new Opinion();
//		o2.setIp("111.222.333.444");
//		o2.setOpinion(true);
//		
//		set.add(o1);
//		set.add(o2);
//		
//		Iterator<Opinion> itr = set.iterator();
//		while(itr.hasNext()) {
//			Opinion o = itr.next();
//			System.out.println(o.getIp());
//		}
		
		strSet.add("test");
		strSet.add("test");
		
		Iterator<String> itr = strSet.iterator();
		while(itr.hasNext()) {
			String o = itr.next();
			System.out.println(o);
		}
	}
	
}
