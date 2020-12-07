package com.example.demo.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;





@Service
public class VehicleOnUrNameService {

	public VehicleOnUrNameService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	private RestTemplate restTemplate = new RestTemplate();

	public List<VehicleOnUrNameEntity> show(String id) {
		
		
		List<VehicleOnUrNameEntity> soln = new ArrayList<VehicleOnUrNameEntity>();
		
		ListBookTicketEntity listTicket=restTemplate.getForObject("http://localhost:8082/lendertickets/"+id, ListBookTicketEntity.class);
		
		List<VehicleOnUrNameEntity> first= listTicket.getListEntity().stream().map(listTick -> {
		return new VehicleOnUrNameEntity(listTick.vehiclenum, listTick.aadharnum, id, listTick.expiry );
		})
				.collect(Collectors.toList());
		
	
		ListRcBookEntity ownVehicle=restTemplate.getForObject("http://localhost:8083/rcbook/"+id, ListRcBookEntity.class);
		
		first.addAll((List<VehicleOnUrNameEntity>) ownVehicle.getListEntity().stream().map(listTick -> {
		return new VehicleOnUrNameEntity(listTick.vehiclenum, "Own Vehicle" ,"",listTick.expiry );
		})
				.collect(Collectors.toList()));
		
		
		return first;
		
	}


	
}
