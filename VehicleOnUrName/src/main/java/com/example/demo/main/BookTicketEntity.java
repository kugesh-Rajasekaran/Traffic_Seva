package com.example.demo.main;

import java.util.Date;



public class BookTicketEntity {

	

	public String vehiclenum;
	public String ticketid;
	public String aadharnum;
	public String lenderaadhar;
	public Date expiry;
	
	
	public BookTicketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookTicketEntity(String vehiclenum, String ticketid, String aadharnum, String lenderaadhar, Date expiry) {
		super();
		this.vehiclenum = vehiclenum;
		this.ticketid = ticketid;
		this.aadharnum = aadharnum;
		this.lenderaadhar = lenderaadhar;
		this.expiry = expiry;
	}

	public BookTicketEntity(String aadharnum, String vehiclenum, String lenderaadhar, Date expiry) {
		super();
		this.aadharnum = aadharnum;
		this.vehiclenum = vehiclenum;
		this.lenderaadhar = lenderaadhar;
		this.expiry = expiry;
	}
	public String getAadharnum() {
		return aadharnum;
	}
	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}
	public String getVehiclenum() {
		return vehiclenum;
	}
	public void setVehiclenum(String vehiclenum) {
		this.vehiclenum = vehiclenum;
	}
	public String getLenderaadhar() {
		return lenderaadhar;
	}
	public void setLenderaadhar(String lenderaadhar) {
		this.lenderaadhar = lenderaadhar;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getTicketid() {
		return ticketid;
	}

	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	
	
	

}
