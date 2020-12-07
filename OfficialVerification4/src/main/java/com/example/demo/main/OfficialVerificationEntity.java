package com.example.demo.main;



import org.springframework.stereotype.Component;



@Component
public class OfficialVerificationEntity {
   

private int previous;
private int one;
private int two;
private int three;
private int total;
	public OfficialVerificationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OfficialVerificationEntity(int previous, int one, int two, int three, int total) {
		super();
		this.previous = previous;
		this.one = one;
		this.two = two;
		this.three = three;
		this.total = total;
	}
	public int getPrevious() {
		return previous;
	}
	public void setPrevious(int previous) {
		this.previous = previous;
	}
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	public int getThree() {
		return three;
	}
	public void setThree(int three) {
		this.three = three;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

	
	
	

}
