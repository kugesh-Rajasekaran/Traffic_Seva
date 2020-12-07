package com.example.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseTableService {

	@Autowired
	public LicenseTableRepository rep;
	


	public Optional<LicenseTableEntity> check(String id) {
		// TODO Auto-generated method stub
		
		
		return rep.findById(id);
	}
	
}
