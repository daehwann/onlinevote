package com.daehwan.vote;


public class Voter {
	private final String key;
	private String ip;
	private boolean opinion;
	
	public Voter(String key, String ip, boolean opinion) {
		this.key = key;
		this.ip = ip;
		this.opinion = opinion;
	}
	
	public String getIp() {
		return ip;
	}
	public boolean isOpinion() {
		return opinion;
	}
	public String getKey(){
		return key;
	}
	
	@Override
	public String toString() {
		return "Opinion [ip=" + ip + ", opinion=" + opinion + "]";
	}
	
	public boolean equals(Object o) {
		if(o == null || !(o instanceof Voter)){
			return false;
		}
		Voter v = (Voter) o;
		if(v.getKey().equals(this.key) || v.getIp().equals(ip)){
			return true;
		}else {
			return false;
		}
		
	}
}

