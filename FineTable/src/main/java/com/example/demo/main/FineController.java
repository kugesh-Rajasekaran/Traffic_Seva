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
public class FineController {

	@Autowired
	public FineService serv;
	
	public FineController() {
		
	}
	

	
    @CrossOrigin
	@RequestMapping("/showfine")
	public ListFineEntity showFine() {
		return  serv.show();
	}
	
   
}
