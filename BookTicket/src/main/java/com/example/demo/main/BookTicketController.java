package com.example.demo.main;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookTicketController {

	@Autowired
	public BookTicketService serv;
	
	public BookTicketController() {
		
	}
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value="/bookticket")
	public BookTicketEntity addTicket(@RequestBody BookTicketEntity ticket) {
		return serv.addTicket(ticket);
	}
	
    @CrossOrigin
	@RequestMapping("/showtickets/{id}")
	public List<BookTicketEntity> showTicket(@PathVariable String id ) {
		return serv.show(id);
	}
	
    
    @CrossOrigin
  	@RequestMapping("/lendertickets/{id}")
  	public ListBookTicketEntity lenderTicket(@PathVariable String id ) {
  		return serv.lender(id);
  	}
	
}
