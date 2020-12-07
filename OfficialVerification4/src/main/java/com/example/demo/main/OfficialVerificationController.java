package com.example.demo.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfficialVerificationController {

	@Autowired
	public OfficialVerificationService serv;
	
	public OfficialVerificationController() {
		
	}
	
    @CrossOrigin
    @RequestMapping(method=RequestMethod.POST,value="/sendNotification")
	public int showOfficial(@RequestBody OfficialVerificationEntity id) {
		return serv.step4Notification(id);
	}

	
	
   
}
