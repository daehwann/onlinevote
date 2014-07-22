package com.daehwan.vote;

public class Opinion {
	private String ip;
	private boolean opinion;
	
	public Opinion(String ip, boolean opinion) {
		this.ip = ip;
		this.opinion = opinion;
	}
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public boolean isOpinion() {
		return opinion;
	}
	public void setOpinion(boolean opinion) {
		this.opinion = opinion;
	}
	
	@Override
	public String toString() {
		return "Opinion [ip=" + ip + ", opinion=" + opinion + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("equals method is executed");
		
		if( o== null) {
			return false;
		}
		if(o instanceof Opinion) {
			String ip = ((Opinion) o).getIp();
			if(ip.equals(this.ip)){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
