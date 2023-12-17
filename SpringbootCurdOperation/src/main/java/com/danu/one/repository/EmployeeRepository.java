package com.danu.one.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.danu.one.entity.Employee;
@Repository
public class EmployeeRepository {
	 public List<Employee> employee=new ArrayList<Employee>();

	public List<Employee> getAll() {
		return employee;
	}

}
