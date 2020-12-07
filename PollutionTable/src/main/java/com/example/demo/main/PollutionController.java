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
public class PollutionController {

	@Autowired
	public PollutionService serv;
	
	public PollutionController() {
		
	}
	
    @CrossOrigin
	@RequestMapping("/pollution/{id}")
	public Optional<PollutionEntity> showOfficial(@PathVariable String id) {
		return serv.get(id);
	}
	
   
}
