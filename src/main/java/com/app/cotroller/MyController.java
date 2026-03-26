package com.app.cotroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.PolicyDetails;
import com.app.repo.PolicyRepo;

@RestController
@RequestMapping("/api/policy")
public class MyController {
	
	@Autowired
	private PolicyRepo pRepo;
	@GetMapping
	public List<PolicyDetails> getFruit(){
		
		return pRepo.findAll();
	
		
		
	}
	
	@PostMapping
	public PolicyDetails addFruit(@RequestBody PolicyDetails pDetails) {
		return pRepo.save(pDetails);	}

}
