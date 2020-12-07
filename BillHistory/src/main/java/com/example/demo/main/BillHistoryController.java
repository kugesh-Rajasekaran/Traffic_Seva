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
public class BillHistoryController {

	@Autowired
	public BillHistoryService serv;
	
	public BillHistoryController() {
		
	}
	

	
    @CrossOrigin
	@RequestMapping("/showbill/{id}")
	public List<BillHistoryEntity> showFine(@PathVariable String id ) {
		return  serv.show(id);
	}
	
   
}
