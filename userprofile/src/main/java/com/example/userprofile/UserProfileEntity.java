package com.example.userprofile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserProfileEntity {
    
	@Id
	private String num;
	public UserProfileEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public UserProfileEntity(String num) {
		super();
		this.num = num;
	}

	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}

}
