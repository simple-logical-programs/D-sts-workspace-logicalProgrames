package com.auto.wiring.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auto.wiring.one.service.CoustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CoustomerService cService;
	
	@GetMapping("/customers")
	public List getList() {
		return cService.getCustomerList();
	}
	

}
