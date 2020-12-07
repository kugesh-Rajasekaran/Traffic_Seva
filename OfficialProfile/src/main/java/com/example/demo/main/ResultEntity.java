package com.example.demo.main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ResultEntity {
    
	int result;
	
	
	public ResultEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ResultEntity(int result) {
		super();
		this.result = result;
	}


	public int getResult() {
		return result;
	}


	public void setResult(int result) {
		this.result = result;
	}

    
}
