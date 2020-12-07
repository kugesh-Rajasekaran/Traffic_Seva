package com.example.demo.main;

import java.util.Date;
import java.util.List;

public class ListBookTicketEntity {
    
	public  List<BookTicketEntity> listEntity;
	
	public ListBookTicketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListBookTicketEntity(List<BookTicketEntity> listEntity) {
		super();
		this.listEntity = listEntity;
	}
	public List<BookTicketEntity> getListEntity() {
		return listEntity;
	}

	public void setListEntity(List<BookTicketEntity> listEntity) {
		this.listEntity = listEntity;
	}

	

}
