package com.example.demo.main;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PollutionService {

	@Autowired
   private PollutionRepository rep;

	public 	PollutionService() {
		super();
	}
	
	
	public void verify(String id){
		
			}


	public Optional<PollutionEntity> get(String id) {
		// TODO Auto-generated method stub
		return rep.findById(id);
	}
	
}
