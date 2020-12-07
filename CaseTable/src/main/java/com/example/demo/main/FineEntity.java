package com.example.demo.main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class FineEntity {
    

	public int fineId;
    public int fineAmt;
    public String reason;
	
	
	
	public FineEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FineEntity(int fineId, int fineAmt, String reason) {
		super();
		this.fineId = fineId;
		this.fineAmt = fineAmt;
		this.reason = reason;
	}



	public int getFineId() {
		return fineId;
	}



	public void setFineId(int fineId) {
		this.fineId = fineId;
	}



	public int getFineAmt() {
		return fineAmt;
	}



	public void setFineAmt(int fineAmt) {
		this.fineAmt = fineAmt;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	
}
