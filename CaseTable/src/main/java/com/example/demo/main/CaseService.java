package com.example.demo.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javassist.bytecode.Descriptor.Iterator;

@Service
public class CaseService {

	@Autowired
	public CaseRepository rep;
	
	@Autowired
	RestTemplate restTemplate;
	

	public 	CaseService() {
		super();
	}
	
	
	
	public ListCaseEntity show(String id){
		
		List<CaseEntity> list=new ArrayList<CaseEntity>();
		List<CaseEntity> solnlist=new ArrayList<CaseEntity>();
		
		 rep.findAll().forEach(list::add);
		ListIterator<CaseEntity> itr= list.listIterator();
		while(itr.hasNext()) {
			CaseEntity ce=new CaseEntity();
			ce=itr.next();
			if((ce.aadharnum).equals(id)) {
				solnlist.add(ce);
			}
			
			
		}
	
		ListCaseEntity lc=new ListCaseEntity(solnlist);
		return lc;
	}



	public int showAmount(String id) {
		int total=0;
	
		List<CaseEntity> list=new ArrayList<CaseEntity>();
		
		ListFineEntity listFine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
		
		 rep.findAll().forEach(list::add);
		ListIterator<CaseEntity> itr= list.listIterator();
		while(itr.hasNext()) {
			CaseEntity ce=new CaseEntity();
			ce=itr.next();
			if((ce.aadharnum).equals(id) && (ce.status).equals("active")) {
				
				total=total+listFine.getListEntity().get((ce.fineId)-1).fineAmt;
				
			}
				
		}
		

		return total;
	}



	public int book(CaseEntity caseEnt) {
	
		
		
		Calendar cal =Calendar.getInstance();
		Date dt=cal.getTime();
		caseEnt.setTime(dt);
		rep.save(caseEnt);
		return 0;
	}





	public int bookFinal(FinalEntity caseEnt) {
		int tot=0;
		
		
		ListFineEntity listFine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
		
		
		
		if(caseEnt.isC1()) {
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(1);
			tot+=listFine.getListEntity().get(0).fineAmt;
			entCase.setRcId("Himself");
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC2()) {
			tot+=listFine.getListEntity().get(1).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(2);
			entCase.setRcId("Himself");
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC3()) {
			tot+=listFine.getListEntity().get(2).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(3);
			entCase.setRcId("Himself");
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC4()) {
			tot+=listFine.getListEntity().get(3).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(4);
			entCase.setRcId("Himself");
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC5()) {
			tot+=listFine.getListEntity().get(4).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(5);
			entCase.setRcId(caseEnt.getRc());
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC6()) {
			tot+=listFine.getListEntity().get(5).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(6);
			entCase.setRcId("Himself");
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC7()) {
			tot+=listFine.getListEntity().get(6).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(7);
			entCase.setRcId("Himself");
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC8()) {
			tot+=listFine.getListEntity().get(7).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(8);
			entCase.setRcId(caseEnt.getRc());
			entCase.setStatus("active");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC9()) {
			tot+=listFine.getListEntity().get(8).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(9);
			entCase.setRcId(caseEnt.getRc());
			entCase.setRcId("Himself");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		
		if(caseEnt.isC10()) {
			tot+=listFine.getListEntity().get(9).fineAmt;
			CaseEntity entCase=new CaseEntity();
			entCase.setAadharnum(caseEnt.getAadhar());
			entCase.setFineId(10);
			entCase.setRcId(caseEnt.getRc());
			entCase.setRcId("Himself");
			entCase.setVerifiedBy(caseEnt.getVerifiedBy());
			this.book(entCase);
		}
		return tot;
	}



	public ListCaseEntity showOff(String id) {
		// TODO Auto-generated method stub
		
		List<CaseEntity> list=new ArrayList<CaseEntity>();
		List<CaseEntity> solnlist=new ArrayList<CaseEntity>();
		
		 rep.findAll().forEach(list::add);
		ListIterator<CaseEntity> itr= list.listIterator();
		while(itr.hasNext()) {
			CaseEntity ce=new CaseEntity();
			ce=itr.next();
			if((ce.verifiedBy).equals(id)) {
				solnlist.add(ce);
			}
			
			
		}
	
		ListCaseEntity lc=new ListCaseEntity(solnlist);
		return lc;
	
	}



	public int delOff(String id) {
int count=0;
		List<CaseEntity> list=new ArrayList<CaseEntity>();
		List<CaseEntity> solnlist=new ArrayList<CaseEntity>();
		
		
		 rep.findAll().forEach(list::add);
		 
		 ListIterator<CaseEntity> itr= list.listIterator();
			while(itr.hasNext()) {
				CaseEntity ce=new CaseEntity();
				ce=itr.next();
				if((ce.aadharnum).equals(id)) {
				//itr.set(new CaseEntity(ce.caseId,ce.fineId, ce.aadharnum, ce.rcId, ce.time, ce.place, ce.verifiedBy, "inactive"));
			rep.delete(ce);
			ce.setStatus("inactive");
			rep.save(ce);
				}
		 
		 
		
	}

			return count;

	}
	
}
