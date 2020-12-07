package com.example.demo.main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LicenseTableEntity {
    
	@Id
	private String licensenum;
	private String name;
	private Date expiry;
	private String dob;
	private String gender;
	private String residentialaddress;
	
	public LicenseTableEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public LicenseTableEntity(String licensenum, String name, Date expiry, String dob, String gender,
			String residentialaddress) {
		super();
		this.licensenum = licensenum;
		this.name = name;
		this.expiry = expiry;
		this.dob = dob;
		this.gender = gender;
		this.residentialaddress = residentialaddress;
	}




	public String getLicensenum() {
		return licensenum;
	}

	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getExpiry() {
		return expiry;
	}

	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResidentialaddress() {
		return residentialaddress;
	}

	public void setResidentialaddress(String residentialaddress) {
		this.residentialaddress = residentialaddress;
	}
	
		

}
