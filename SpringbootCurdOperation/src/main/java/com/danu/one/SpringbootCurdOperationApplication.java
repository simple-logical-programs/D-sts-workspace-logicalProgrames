package com.danu.one;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.danu.one.entity.Employee;
import com.danu.one.repository.EmployeeRepository;
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication


public class SpringbootCurdOperationApplication implements CommandLineRunner  {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCurdOperationApplication.class, args);
	}
	@Override
	public void run(String... args)
	{
		Employee e1=new Employee(1,"danu","bagalkot");
		Employee e2=new Employee(2,"kavi","bilagi");
		
		employeeRepository.employee.addAll(Arrays.asList(e1,e2));
	}

}
