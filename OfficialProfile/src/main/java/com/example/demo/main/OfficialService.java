package com.example.demo.main;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.bytecode.Descriptor.Iterator;

@Service
public class OfficialService {

	@Autowired
	public OfficialRepository rep;
	

	public 	OfficialService() {
		super();
	}
	
	
	public ResultEntity show(OfficialEntity off){
		ResultEntity res=new ResultEntity();
		Optional<OfficialEntity> oe= rep.findById(off.official);
		if(oe.get()==null) {
			res.result=0;
			return res;		
		}
		
		else if((oe.get().pass).equals(off.pass)) {
			res.result=1;
			return res;		
		}
		else {
			res.result=0;
		return res;	
		}
	}


	public Optional<OfficialEntity> showVal(String id) {
	
		Optional<OfficialEntity> off =rep.findById(id);
		return off;
	}


	public int change(OfficialEntity off) {
		// TODO Auto-generated method stub
		
		OfficialEntity org=rep.findById(off.official).get();
			org.setBalance(off.balance+org.balance);
			rep.save(org);
		
		return off.balance;
	}


	public boolean showLast(OfficialEntity off) {
	
	String str=Base64.getEncoder().encodeToString(off.getPass().getBytes());
	
		
	if((str).equals(rep.findById(off.getOfficial()).get().getPass())) {
		return true;
	}
	else {
		return false;
	}
	
	
	}
	
}
