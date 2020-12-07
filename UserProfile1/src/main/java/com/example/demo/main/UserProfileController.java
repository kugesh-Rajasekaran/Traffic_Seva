package com.example.demo.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

	@Autowired
	public UserProfileService serv;
	
	@Value("$(api.key)")
	public String key;
	
	public UserProfileController() {
		
	}
	
	@RequestMapping("/test")
	public String test() {
		return key;
	}
	
	@CrossOrigin
	@RequestMapping("/userprofile")
    public List<UserProfileEntity> getAll(){
    	return serv.getAll();
    }
	
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/authenticate/{id}")
    public Optional<UserProfileEntity> authenticateUser(@RequestBody UserProfileEntity user) {
    	return serv.authenticate(user);
    }
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/authenticatefirst/{id}")
    public boolean authenticateFirst(@RequestBody UserProfileEntity user) {
    	return serv.authenticateInit(user);
    }
	
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/encypt/{id}")
    public String encrypt(@RequestBody UserProfileEntity user) {
    	return serv.encryptAns(user);
    }
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET,value="/decrypt/{id}")
    public String decrypt(@PathVariable String id) {
    	return serv.decryptAns(id);
    }
	
	@CrossOrigin
	@RequestMapping("/userprofile/{id}")
    public Optional<UserProfileEntity> getTopic(@PathVariable String id) {
    	return serv.getTopic(id);
    }
	
	
	
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value="/userprofile")
	public void addTopic(@RequestBody UserProfileEntity topic) {
		 serv.addTopic(topic);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.PUT, value="/userprofile/{id}")
	public void updateTopic(@RequestBody UserProfileEntity topic) {
		 serv.updateTopic(topic);
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE, value="/userprofile/{id}")
	public void deleteTopic(@PathVariable String id) {
		serv.deleteTopic(id);
	}
	
}
