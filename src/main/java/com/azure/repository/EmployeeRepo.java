package com.azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
