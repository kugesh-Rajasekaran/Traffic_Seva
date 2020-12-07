package com.example.demo.main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OfficialEntity {
    
	@Id
	public String official;
	public String img;
	public String pass;
	public String policeId;
	public String designation;
	public String homeAddress;
	public String station;
	public String stationAddress;
	public String lastCheckedDate;
	public String aadharNumber;
	public int balance;
	public OfficialEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public OfficialEntity(String official, String img, String pass, String policeId, String designation,
			String homeAddress, String station, String stationAddress, String lastCheckedDate, String aadharNumber,
			int balance) {
		super();
		this.official = official;
		this.img = img;
		this.pass = pass;
		this.policeId = policeId;
		this.designation = designation;
		this.homeAddress = homeAddress;
		this.station = station;
		this.stationAddress = stationAddress;
		this.lastCheckedDate = lastCheckedDate;
		this.aadharNumber = aadharNumber;
		this.balance = balance;
	}



	public String getImg() {
		return img;
	}



	public void setImg(String img) {
		this.img = img;
	}



	public String getPoliceId() {
		return policeId;
	}

	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public String getStationAddress() {
		return stationAddress;
	}

	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}

	public String getLastCheckedDate() {
		return lastCheckedDate;
	}

	public void setLastCheckedDate(String lastCheckedDate) {
		this.lastCheckedDate = lastCheckedDate;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getOfficial() {
		return official;
	}

	public void setOfficial(String official) {
		this.official = official;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

    
}
