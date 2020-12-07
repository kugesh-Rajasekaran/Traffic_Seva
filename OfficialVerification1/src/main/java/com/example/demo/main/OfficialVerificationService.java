package com.example.demo.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class OfficialVerificationService {


	
	
	public RestTemplate restTemplate = new RestTemplate();
	 public static final String ACCOUNT_SID = "AC8385314c9ff82af7639fc1a6c925c5ba";
	  public static final String AUTH_TOKEN = "df2d3b0f5e151129c50996ad59f26408";
	public 	OfficialVerificationService() {
		super();
	}
	
	
	public OfficialVerificationEntity verify(String id){
		
		 OfficialVerificationEntity off =new OfficialVerificationEntity() ;
		
		 
	

		    
		  

		 
		 
		 
		 
		int current=0;
		//Aadhar car checking
		UserProfileEntity aadhar=restTemplate.getForObject("http://localhost:8081/userprofile/"+id, UserProfileEntity.class);
	if(aadhar!=null) {
		off.setAadharCheck("validated for this person");
		off.setAadhar(aadhar);
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
		LicenseTableEntity license=restTemplate.getForObject("http://localhost:8089/checklicense/"+aadhar.getLicensenum(), LicenseTableEntity.class);
	    if(license!=null) {
	    	if(date.compareTo(license.getExpiry()) < 0) {
	    		off.setLicense(license);
	    		off.setLicenseCheck("License - validated for this person ");
	    	}
	    	
	    	else {
	    		
	    		ListFineEntity listFine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
	    		 current=listFine.getListEntity().get(3).fineAmt;
	    		off.setLicense(license);
	    		off.setLicenseCheck("expired");
	    		
	    	}
	    }
	    else {
	    	ListFineEntity listFine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
   		 current=listFine.getListEntity().get(6).fineAmt;
	    	off.setLicenseCheck("not present ");
	    }
		
	    ListCaseEntity cases=restTemplate.getForObject("http://localhost:8085/showcases/"+id, ListCaseEntity.class);
	    if(cases!=null) {
	    	off.setListCaseEntity(cases);
	   giveLateAlert(cases);
	    	
	    }
	    else {
	    	//off.setListCaseEntity(null);
	    }
	    
	    
	    int amtOut=restTemplate.getForObject("http://localhost:8085/showamount/"+id, int.class);
		off.setPendingFine(amtOut);
		
		off.setCurrentFine(current);

	}
	else {
		giveLackOfAadhar();
		return null;
		
	}
	
	//license checking

		return off;
		
	}
	
	public static void giveLateAlert(ListCaseEntity cases) {
	 	for(CaseEntity ce:cases.listEntity) {
    		if(ce.fineId==6) {
    			 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    			    Message message = Message.creator(
    			        new PhoneNumber("+917598948837"),
    			        new PhoneNumber("+17273086039"),
    			        "***ALERT***\nAADHAR NO : "+ce.aadharnum+"\nCASE ID : "+ce.caseId+"\nREASON : Crime"+"\nRC NUM : "+ce.rcId+"\nPLACE : "+ce.place)
    			    .create();
    		}
    	}
	}
	
	public static void giveLackOfAadhar( ) {
	 	
    		
    			 Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    			    Message message = Message.creator(
    			        new PhoneNumber("+917598948837"),
    			        new PhoneNumber("+17273086039"),
    			        "***ALERT***\nA Driver don't have an Aadhar")
    			    .create();
    		
	}
	

	
}
