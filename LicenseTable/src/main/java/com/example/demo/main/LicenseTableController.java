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
public class LicenseTableController {

	@Autowired
	public LicenseTableService serv;
	
	public LicenseTableController() {
		
	}
	

	
	
	
	@CrossOrigin
	@RequestMapping("/checklicense/{licenseid}")
    public Optional<LicenseTableEntity> getLicense(@PathVariable String licenseid) {
    	return serv.check(licenseid);
    }
	

	
		
}
