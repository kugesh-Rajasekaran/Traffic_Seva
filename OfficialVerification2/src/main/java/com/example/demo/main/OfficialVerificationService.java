package com.example.demo.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OfficialVerificationService {


	
	
	public RestTemplate restTemplate = new RestTemplate();

	@Autowired
	public OfficialVerificationEntity off;
	public 	OfficialVerificationService() {
		super();
	}
	
	
	public OfficialVerificationEntity verify(String id){
		int amt=0;
		RcBookEntity rc=restTemplate.getForObject("http://localhost:8083/rcbookfind/"+id, RcBookEntity.class);
		
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    
	    if(rc!=null) {
		if(date.compareTo(rc.getExpiry()) < 0) {
			off.setRcstatus("Verified expiration");
			off.setRcbook(rc);
		}
		else {
			ListFineEntity fine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
			amt+=fine.getListEntity().get(7).fineAmt;
			off.setRcstatus("Expired");
			off.setRcbook(rc);
		}}
	    
	    else {
	    	ListFineEntity fine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
			amt+=fine.getListEntity().get(8).fineAmt;
	    	off.setRcstatus("Doesn't have rc book and it can be a duplicate plate number");
	    }
	
	    PollutionEntity poll=restTemplate.getForObject("http://localhost:8091/pollution/"+id, PollutionEntity.class);
	    
	    if(poll!=null) {
			if(date.compareTo(poll.getExpiry()) < 0) {
			
				off.setPollutionstatus("Verified expiration");
				off.setPollution(poll);
			}
			else {
				ListFineEntity fine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
				amt+=fine.getListEntity().get(9).fineAmt;
				off.setPollutionstatus("Expired");
				off.setPollution(poll);
			}}
		    
		    else {
		    	ListFineEntity fine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
				amt+=fine.getListEntity().get(8).fineAmt;
		    	off.setPollutionstatus("Doesn't have pollution book and it can be a duplicate plate number");
		    }
	    off.setCurrent(amt);
	    return off;
	}
	
}
