package com.example.demo.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class BillHistoryService {

	@Autowired
	private RestTemplate restTemplate;
	

	public 	BillHistoryService() {
		super();
	}
	
	
	
	public List<BillHistoryEntity> show(String id){
		ListCaseEntity listCase=restTemplate.getForObject("http://localhost:8085/showcases/"+id, ListCaseEntity.class);
		
		ListFineEntity listFine=restTemplate.getForObject("http://localhost:8086/showfine", ListFineEntity.class);
		
		//List<FineEntity> secListFine = listFine.getListEntity().;
		return  listCase.getListEntity().stream().map(listTick -> {
		return new BillHistoryEntity(listTick.caseId, listTick.fineId, listTick.aadharnum, listTick.rcId, listTick.time, listTick.place, listFine.getListEntity().get((listTick.fineId)-1).fineAmt ,listTick.status );
		})
				.collect(Collectors.toList());
		
	
	}
	
}
