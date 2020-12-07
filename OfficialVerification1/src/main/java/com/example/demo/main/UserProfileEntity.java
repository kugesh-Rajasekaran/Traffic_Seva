package com.example.demo.main;




public class UserProfileEntity {
    
	
	private String aadharnum;
	private String name;
	private String pass;
	private String dob;
	private String gender;
	private String licensenum;
	private String residentialaddress;
	
	public UserProfileEntity(String aadharnum, String name, String pass, String dob, String gender, String licensenum,
			String residentialaddress) {
		super();
		this.aadharnum = aadharnum;
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

	public UserProfileEntity(String aadharnum, String name, String dob, String gender, String licensenum,
			String residentialaddress) {
		super();
		this.aadharnum = aadharnum;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.licensenum = licensenum;
		this.residentialaddress = residentialaddress;
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

	public UserProfileEntity() {
		
	}

	public UserProfileEntity(String aadharnum, String name, String dob) {
		super();
		this.aadharnum = aadharnum;
		this.name = name;
		this.dob = dob;
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
