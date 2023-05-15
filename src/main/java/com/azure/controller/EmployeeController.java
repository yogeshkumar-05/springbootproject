package com.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.Employee;
import com.azure.repository.EmployeeRepo;


@RestController
@RequestMapping
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRepo.findAll();
	}
}
