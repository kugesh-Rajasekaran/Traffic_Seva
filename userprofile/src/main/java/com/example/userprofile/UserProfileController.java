package com.example.userprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserProfileController {

	@Autowired
	UserProfileRepo rep;
	public UserProfileController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/first/{kuk}")
	public UserProfileEntity getString(@RequestBody UserProfileEntity topic) {
		return rep.save(topic);
	}

}
