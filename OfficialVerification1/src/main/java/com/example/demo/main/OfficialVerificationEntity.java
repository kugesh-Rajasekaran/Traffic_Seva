package com.example.demo.main;

import java.util.Date;

import org.springframework.stereotype.Component;




public class OfficialVerificationEntity {
   

	public UserProfileEntity aadhar;
	
	public String aadharCheck;
	
	public LicenseTableEntity license;
	
	public String licenseCheck;
	public ListCaseEntity listCaseEntity;
	
	public int pendingFine;
	
	public int currentFine;
	
	public OfficialVerificationEntity() {
		super();
	}

	public OfficialVerificationEntity(UserProfileEntity aadhar, String aadharCheck, LicenseTableEntity license,
			String licenseCheck, ListCaseEntity listCaseEntity, int pendingFine, int currentFine) {
		super();
		this.aadhar = aadhar;
		this.aadharCheck = aadharCheck;
		this.license = license;
		this.licenseCheck = licenseCheck;
		this.listCaseEntity = listCaseEntity;
		this.pendingFine = pendingFine;
		this.currentFine = currentFine;
	}

	

	public UserProfileEntity getAadhar() {
		return aadhar;
	}

	public void setAadhar(UserProfileEntity aadhar) {
		this.aadhar = aadhar;
	}

	public String getAadharCheck() {
		return aadharCheck;
	}

	public void setAadharCheck(String aadharCheck) {
		this.aadharCheck = aadharCheck;
	}

	public LicenseTableEntity getLicense() {
		return license;
	}

	public void setLicense(LicenseTableEntity license) {
		this.license = license;
	}

	public String getLicenseCheck() {
		return licenseCheck;
	}

	public void setLicenseCheck(String licenseCheck) {
		this.licenseCheck = licenseCheck;
	}

	public ListCaseEntity getListCaseEntity() {
		return listCaseEntity;
	}

	public void setListCaseEntity(ListCaseEntity listCaseEntity) {
		this.listCaseEntity = listCaseEntity;
	}

	public int getPendingFine() {
		return pendingFine;
	}

	public void setPendingFine(int amtOut) {
		this.pendingFine = amtOut;
	}

	public int getCurrentFine() {
		return currentFine;
	}

	public void setCurrentFine(int currentFine) {
		this.currentFine = currentFine;
	}



	

}
