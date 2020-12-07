package com.example.demo.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.base.ResourceSet;

@RestController
public class OfficialVerificationController {

	@Autowired
	public OfficialVerificationService serv;
	
	public OfficialVerificationController() {
		
	}
	
    @CrossOrigin
	@RequestMapping("/step1/{id}")
	public OfficialVerificationEntity showOfficial(@PathVariable String id) {
		return serv.verify(id);
	}
	
 
   
}
