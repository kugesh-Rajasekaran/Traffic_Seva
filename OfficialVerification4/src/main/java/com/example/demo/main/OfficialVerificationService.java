package com.example.demo.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class OfficialVerificationService {
	
	
	public RestTemplate restTemplate = new RestTemplate();
	 public static final String ACCOUNT_SID = "AC3446de79847e1fda03f1a0f92d6ee768";
	  public static final String AUTH_TOKEN = "6f0bb6052c3c26d1ecd9c7c7778faafe";
	  
	  
	public int step4Notification(OfficialVerificationEntity id) {
		 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		    Message message = Message.creator(
		        new PhoneNumber("+919443642024"),
		        new PhoneNumber("+12057827285"),
		        "***ALERT FROM TRAFFIC SEVA***\nOUTSTANDING AMOUNT : "+id.getPrevious()+"\nIN PERSON VERIFICATION : "+id.getOne()+"\nIN VEHICLE VERIFICATION : "+id.getTwo()+"\nIN POLICE VERIFICATION : "+id.getThree()+"\nNEW OUTSTANDING AMOUNT : "+id.getTotal())
		    .create();

		return 1;
	}


	
    		
    			
	
	

	
}
