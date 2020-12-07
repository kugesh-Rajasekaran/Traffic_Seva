package com.example.demo.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OfficialVerificationService {


	
	
	public RestTemplate restTemplate = new RestTemplate();

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
	    }
	    else {
	    	off.setListCaseEntity(cases);
	    }
	    
	    
	    int amtOut=restTemplate.getForObject("http://localhost:8085/showamount/"+id, int.class);
		off.setPendingFine(amtOut);
		
		off.setCurrentFine(current);

	}
	else {
		off.setAadharCheck("not present");
		
	}
	
	//license checking
		return off;
	}
	
}
