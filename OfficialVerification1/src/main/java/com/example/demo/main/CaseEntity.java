package com.example.demo.main;

import java.util.Date;



public class CaseEntity {
   
	public int caseId;
	public int fineId;
	public String aadharnum;
	public String rcId;
	public Date time;
	public String place;
	public String status;
	
	
	
	public CaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CaseEntity(int caseId, int fineId, String aadharnum, String rcId, Date time, String place, String status) {
		super();
		this.caseId = caseId;
		this.fineId = fineId;
		this.aadharnum = aadharnum;
		this.rcId = rcId;
		this.time = time;
		this.place = place;
		this.status = status;
	}



	public int getCaseId() {
		return caseId;
	}



	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}



	public int getFineId() {
		return fineId;
	}



	public void setFineId(int fineId) {
		this.fineId = fineId;
	}



	public String getAadharnum() {
		return aadharnum;
	}



	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}



	public String getRcId() {
		return rcId;
	}



	public void setRcId(String rcId) {
		this.rcId = rcId;
	}



	public Date getTime() {
		return time;
	}



	public void setTime(Date time) {
		this.time = time;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}


}
