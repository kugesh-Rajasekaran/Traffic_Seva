package com.example.demo.main;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProfileEntity {
    
	@Id
	private String aadharnum;
	private String img;
	private String name;
	private String pass;
	private String dob;
	private String gender;
	private String licensenum;
	private String residentialaddress;
	public UserProfileEntity() {
		
	}

 

	public UserProfileEntity(String aadharnum, String img, String name, String pass, String dob, String gender,
			String licensenum, String residentialaddress) {
		super();
		this.aadharnum = aadharnum;
		this.img = img;
		this.name = name;
		this.pass = pass;
		this.dob = dob;
		this.gender = gender;
		this.licensenum = licensenum;
		this.residentialaddress = residentialaddress;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getGender() {
		return gender;
	}



	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLicensenum() {
		return licensenum;
	}

	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}

	public String getResidentialaddress() {
		return residentialaddress;
	}

	public void setResidentialaddress(String residentialaddress) {
		this.residentialaddress = residentialaddress;
	}




	public String getAadharnum() {
		return aadharnum;
	}

	public void setAadharnum(String aadharnum) {
		this.aadharnum = aadharnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	

}
