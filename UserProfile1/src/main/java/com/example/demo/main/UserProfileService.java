package com.example.demo.main;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {

	@Autowired
	public UserProfileRepository rep;
	
	public List<UserProfileEntity> getAll(){
		List<UserProfileEntity> Topics=new ArrayList<UserProfileEntity>();
		rep.findAll().forEach(Topics::add);
		return Topics;
		
	}
	
	public Optional<UserProfileEntity> getTopic(String id) {
		return rep.findById(id);
	}
	
	public void addTopic(UserProfileEntity topic) {
		
		rep.save(topic);
	}
	
	public void updateTopic(UserProfileEntity topic) {
		rep.save(topic);
		
	}
	
	public void deleteTopic(String id) {
		rep.deleteById(id);
		
	}

	public Optional<UserProfileEntity> authenticate(UserProfileEntity user) {
		
		
		return rep.findById(user.getAadharnum());
	}
	
	public boolean authenticateInit(UserProfileEntity user) {
		
	//	String userPass=Base64.getEncoder().encodeToString(user.getPass().getBytes());
		String userPass=user.getPass();
		Optional<UserProfileEntity> res=rep.findById(user.getAadharnum());
		
		if((userPass).equals(res.get().getPass())) {
			return true;
		}
		else {
			return false;
		}
		//byte[] str= Base64.getMimeDecoder().decode(res.get().getPass());
		//res.get().setPass(Arrays.toString(str));
		//return rep.findById(user.getAadharnum());
	}

	public String encryptAns(UserProfileEntity user) {
		
		
		return Base64.getEncoder().encodeToString(user.getPass().getBytes());
	}

	public String decryptAns(String user) {
		// TODO Auto-generated method stub
		return  Base64.getDecoder().decode(user.getBytes()).toString();
	}
	
}
