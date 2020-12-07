package com.example.demo.main;

import java.util.Date;

import org.springframework.stereotype.Component;



@Component
public class OfficialVerificationEntity {
   

	private RcBookEntity rcbook;
	private String rcstatus;
	private PollutionEntity pollution;
	private String pollutionstatus;
	private int total;
	private int current;
	public OfficialVerificationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OfficialVerificationEntity(RcBookEntity rcbook, String rcstatus, PollutionEntity pollution,
			String pollutionstatus, int total, int current) {
		super();
		this.rcbook = rcbook;
		this.rcstatus = rcstatus;
		this.pollution = pollution;
		this.pollutionstatus = pollutionstatus;
		this.total = total;
		this.current = current;
	}
	public RcBookEntity getRcbook() {
		return rcbook;
	}
	public void setRcbook(RcBookEntity rcbook) {
		this.rcbook = rcbook;
	}
	public String getRcstatus() {
		return rcstatus;
	}
	public void setRcstatus(String rcstatus) {
		this.rcstatus = rcstatus;
	}
	public PollutionEntity getPollution() {
		return pollution;
	}
	public void setPollution(PollutionEntity pollution) {
		this.pollution = pollution;
	}
	public String getPollutionstatus() {
		return pollutionstatus;
	}
	public void setPollutionstatus(String pollutionstatus) {
		this.pollutionstatus = pollutionstatus;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}
	
	
	

}
