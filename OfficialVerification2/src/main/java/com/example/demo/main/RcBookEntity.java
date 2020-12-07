package com.example.demo.main;

import java.util.Date;



public class RcBookEntity {
    
	
	public String vehiclenum;
	public String aadharnum;
	public String bikemodel;
	public String companyname;
	public String rcno;
	public String chasisno;
	public Date expiry;
	public Date regdate;
	
	
	
	
	
	public RcBookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RcBookEntity(String vehiclenum, String aadharnum, String bikemodel, String companyname, String rcno,
			String chasisno, Date expiry, Date regdate) {
		super();
		this.vehiclenum = vehiclenum;
		this.aadharnum = aadharnum;
		this.bikemodel = bikemodel;
		this.companyname = companyname;
		this.rcno = rcno;
		this.chasisno = chasisno;
		this.expiry = expiry;
		this.regdate = regdate;
	}
	public String getVehiclenum() {
		return vehiclenum;
	}
	public void setVehiclenum(String vehiclenum) {
		this.vehiclenum = vehiclenum;
	}
	public String getAadharnum() {
		return aadharnum;
	}
	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}
	public String getBikemodel() {
		return bikemodel;
	}
	public void setBikemodel(String bikemodel) {
		this.bikemodel = bikemodel;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getRcno() {
		return rcno;
	}
	public void setRcno(String rcno) {
		this.rcno = rcno;
	}
	public String getChasisno() {
		return chasisno;
	}
	public void setChasisno(String chasisno) {
		this.chasisno = chasisno;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
	
		
	

}
