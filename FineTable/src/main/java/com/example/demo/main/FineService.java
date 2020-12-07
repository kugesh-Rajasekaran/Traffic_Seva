package com.example.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.bytecode.Descriptor.Iterator;

@Service
public class FineService {

	@Autowired
	public FineRepository rep;
	

	public 	FineService() {
		super();
	}
	
	
	
	public ListFineEntity show(){
		
		
		List<FineEntity> fine=(List<FineEntity>) rep.findAll();
		ListFineEntity listFine=new ListFineEntity(fine);
		return listFine;
	}
	
}
