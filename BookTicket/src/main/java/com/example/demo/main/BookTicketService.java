package com.example.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookTicketService {
	@Autowired
	public BookTicketRepository rep;
	public BookTicketEntity addTicket(BookTicketEntity ticket) {
	return	rep.save(ticket);	
	}
	public List<BookTicketEntity> show(String id) {
		List<BookTicketEntity> soln=new ArrayList<BookTicketEntity>();
		 rep.findAll().forEach(soln::add);
		 List<BookTicketEntity> newSoln=new ArrayList<BookTicketEntity>();
		 ListIterator<BookTicketEntity>  iterator = soln.listIterator();
		 while (iterator.hasNext()) { 
			 BookTicketEntity stor=new BookTicketEntity();
			 stor=iterator.next();
          if(((stor.aadharnum).toString()).equals(id)) {
            	newSoln.add(stor);
           }
         } 
		
	return newSoln;
	}
	
	public ListBookTicketEntity lender(String id) {
		List<BookTicketEntity> soln=new ArrayList<BookTicketEntity>();
		 rep.findAll().forEach(soln::add);
		 ArrayList<BookTicketEntity> newSoln=new ArrayList<BookTicketEntity>();
		 ListIterator<BookTicketEntity>  iterator = soln.listIterator();
		 while (iterator.hasNext()) { 
			 BookTicketEntity stor=new BookTicketEntity();
			 stor=iterator.next();
          if(((stor.lenderaadhar).toString()).equals(id)) {
            	newSoln.add(stor);
           }
         } 
		ListBookTicketEntity ent=new ListBookTicketEntity(newSoln);
	return ent;
	}
	
}
