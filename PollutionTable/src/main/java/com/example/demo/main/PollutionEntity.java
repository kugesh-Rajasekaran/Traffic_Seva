package com.example.demo.main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;



@Entity
public class PollutionEntity {
   
   @Id
   private String vehicleno;
   private String aadhar;
   private Date expiry;
   private int rcno;
public PollutionEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public PollutionEntity(String vehicleno, String aadhar, Date expiry, int rcno) {
	super();
	this.vehicleno = vehicleno;
	this.aadhar = aadhar;
	this.expiry = expiry;
	this.rcno = rcno;
}

public String getVehicleno() {
	return vehicleno;
}
public void setVehicleno(String vehicleno) {
	this.vehicleno = vehicleno;
}
public Date getExpiry() {
	return expiry;
}
public void setExpiry(Date expiry) {
	this.expiry = expiry;
}
public int getRcno() {
	return rcno;
}
public void setRcno(int rcno) {
	this.rcno = rcno;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}

   
   
	
	

}
