package com.example.demo.main;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class FinalEntity {
    
	private boolean c1;
	private boolean c2;
	private boolean c3;
	private boolean c4;
	private boolean c5;
	private boolean c6;
	private boolean c7;
	private boolean c8;
	private boolean c9;
	private boolean c10;
	private String aadhar;
	private String rc;
	private String verifiedBy;
	public FinalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	



	public FinalEntity(boolean c1, boolean c2, boolean c3, boolean c4, boolean c5, boolean c6, boolean c7, boolean c8,
			boolean c9, boolean c10, String aadhar, String rc, String verifiedBy) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.c7 = c7;
		this.c8 = c8;
		this.c9 = c9;
		this.c10 = c10;
		this.aadhar = aadhar;
		this.rc = rc;
		this.verifiedBy = verifiedBy;
	}






	public String getVerifiedBy() {
		return verifiedBy;
	}






	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}






	public String getAadhar() {
		return aadhar;
	}



	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}



	public String getRc() {
		return rc;
	}



	public void setRc(String rc) {
		this.rc = rc;
	}



	public boolean isC1() {
		return c1;
	}


	public void setC1(boolean c1) {
		this.c1 = c1;
	}


	public boolean isC2() {
		return c2;
	}


	public void setC2(boolean c2) {
		this.c2 = c2;
	}


	public boolean isC3() {
		return c3;
	}


	public void setC3(boolean c3) {
		this.c3 = c3;
	}


	public boolean isC4() {
		return c4;
	}


	public void setC4(boolean c4) {
		this.c4 = c4;
	}


	public boolean isC5() {
		return c5;
	}


	public void setC5(boolean c5) {
		this.c5 = c5;
	}


	public boolean isC6() {
		return c6;
	}


	public void setC6(boolean c6) {
		this.c6 = c6;
	}


	public boolean isC7() {
		return c7;
	}


	public void setC7(boolean c7) {
		this.c7 = c7;
	}


	public boolean isC8() {
		return c8;
	}


	public void setC8(boolean c8) {
		this.c8 = c8;
	}


	public boolean isC9() {
		return c9;
	}


	public void setC9(boolean c9) {
		this.c9 = c9;
	}


	public boolean isC10() {
		return c10;
	}


	public void setC10(boolean c10) {
		this.c10 = c10;
	}


}
