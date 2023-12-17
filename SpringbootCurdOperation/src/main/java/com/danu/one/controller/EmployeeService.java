package com.danu.one.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danu.one.entity.Employee;
import com.danu.one.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public List<Employee>getAll(){
		return employeeRepository.getAll();
		
	}
 
}
