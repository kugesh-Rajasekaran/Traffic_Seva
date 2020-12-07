package com.example.demo.main;

import java.util.Date;



public class VehicleOnUrNameEntity {
    
 

	public String vehicleregnum;
	public String vehicleowner;
	public String ticketissueddate;
	public Date ticketexpiry;
	
	
	
	
	public VehicleOnUrNameEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VehicleOnUrNameEntity(String vehicleregnum, String vehicleowner, String ticketissueddate,
			Date ticketexpiry) {
		super();
		this.vehicleregnum = vehicleregnum;
		this.vehicleowner = vehicleowner;
		this.ticketissueddate = ticketissueddate;
		this.ticketexpiry = ticketexpiry;
	}
	public String getVehicleregnum() {
		return vehicleregnum;
	}
	public void setVehicleregnum(String vehicleregnum) {
		this.vehicleregnum = vehicleregnum;
	}
	public String getVehicleowner() {
		return vehicleowner;
	}
	public void setVehicleowner(String vehicleowner) {
		this.vehicleowner = vehicleowner;
	}
	public String getTicketissueddate() {
		return ticketissueddate;
	}
	public void setTicketissueddate(String ticketissueddate) {
		this.ticketissueddate = ticketissueddate;
	}
	public Date getTicketexpiry() {
		return ticketexpiry;
	}
	public void setTicketexpiry(Date ticketexpiry) {
		this.ticketexpiry = ticketexpiry;
	}
	
	
	
	
	
}
