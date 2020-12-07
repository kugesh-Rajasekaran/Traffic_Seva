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
public class OfficialController {

	@Autowired
	public OfficialService serv;
	
	public OfficialController() {
		
	}
	
    @CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/showofficial/{id}")
	public ResultEntity validateOfficial(@RequestBody OfficialEntity off) {
		return serv.show(off);
	}
    
    
    @CrossOrigin
  	@RequestMapping(method=RequestMethod.POST,value="/last/{id}")
  	public boolean last(@RequestBody OfficialEntity off) {
  		return serv.showLast(off);
  	}
    
    @CrossOrigin
  	@RequestMapping("/officialProfile/{id}")
  	public Optional<OfficialEntity> showOfficial(@PathVariable String id) {
  		return serv.showVal(id);
  	}
    
  
	
    @CrossOrigin
   	@RequestMapping(method=RequestMethod.POST,value="/changeamount")
   	public int changeAmt(@RequestBody OfficialEntity off) {
   		return serv.change(off);
   	}
   
}
