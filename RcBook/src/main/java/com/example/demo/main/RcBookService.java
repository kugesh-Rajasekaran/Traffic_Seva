package com.example.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RcBookService {

	@Autowired
	public RcBookRepository rep;
	

	

	public ListRcBookEntity get(String id) {
		List<RcBookEntity> soln=new ArrayList<RcBookEntity>();
		 rep.findAll().forEach(soln::add);
		 List<RcBookEntity> newSoln=new ArrayList<RcBookEntity>();
		 ListIterator<RcBookEntity>  iterator = soln.listIterator();
		 while (iterator.hasNext()) { 
			 RcBookEntity stor=new RcBookEntity();
			 stor=iterator.next();
          if(((stor.aadharnum).toString()).equals(id)) {
            	newSoln.add(stor);
           }
         } 
ListRcBookEntity fin=new ListRcBookEntity(newSoln);
	return fin;
	}




	public Optional<RcBookEntity> getEntity(String id) {
		// TODO Auto-generated method stub
		Optional<RcBookEntity> rc = rep.findById(id);
		return rc;
	}


	
}
