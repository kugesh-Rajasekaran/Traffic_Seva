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
public class VehicleOnUrNameController {

	@Autowired
	public VehicleOnUrNameService serv;
	
	public VehicleOnUrNameController() {
		super();
	}
	

	
    @CrossOrigin
	@RequestMapping("/showvehicles/{id}")
	public List<VehicleOnUrNameEntity> showVehicles(@PathVariable String id ) {
		return serv.show(id);
	}
	
    
}
