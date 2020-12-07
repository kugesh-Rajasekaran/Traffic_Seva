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
public class CaseController {

	@Autowired
	public CaseService serv;
	
	public CaseController() {
		
	}
	
    @CrossOrigin
	@RequestMapping("/showcases/{id}")
	public ListCaseEntity showCases(@PathVariable String id ) {
		return serv.show(id);
	}
    
    @CrossOrigin
   	@RequestMapping("/showamount/{id}")
   	public int showAmount(@PathVariable String id) {
   		return serv.showAmount(id);
   	}
    
    
    @CrossOrigin
   	@RequestMapping("/officercases/{id}")
   	public ListCaseEntity showOfficer(@PathVariable String id) {
   		return serv.showOff(id);
   	}
    
    
    @CrossOrigin
   	@RequestMapping(method=RequestMethod.POST, value="/bookcases")
   	public int bookCases(@RequestBody CaseEntity caseEnt) {
   		return serv.book(caseEnt);
   	}
    
    @CrossOrigin
   	@RequestMapping(method=RequestMethod.POST, value="/booklistcases")
   	public int bookCases(@RequestBody FinalEntity caseEnt) {
   		return serv.bookFinal(caseEnt);
   	}
    
   
    @CrossOrigin
   	@RequestMapping("/deletecases/{id}")
   	public int delOfficer(@PathVariable String id) {
   		return serv.delOff(id);
   	}
    
	
   
}
