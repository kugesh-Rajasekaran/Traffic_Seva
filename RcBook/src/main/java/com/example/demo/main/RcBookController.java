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
public class RcBookController {

	@Autowired
	public RcBookService serv;
	
	public RcBookController() {
		
	}
     
	@CrossOrigin
	@RequestMapping("/rcbook/{id}")
	public ListRcBookEntity getEntities(@PathVariable String id){
		
		
		return serv.get(id);
	}
	
	@CrossOrigin
	@RequestMapping("/rcbookfind/{id}")
	public Optional<RcBookEntity> getEntity(@PathVariable String id){
		
		
		return serv.getEntity(id);
	}
	
	
	
}
