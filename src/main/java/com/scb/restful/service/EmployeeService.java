package com.scb.restful.service;

import java.util.List;

import com.scb.restful.resource.Employee;

public interface EmployeeService {
	
	/*
	 * Create methods 
	 */
	public long createEmployee(Employee e);
	public void createEmployee(List<Employee> employees);
	
	/**
	 * Read Methods
	 * 
	 */
	
	public Employee getEmployee(long employeeId);
	
	/**
	 * Update Methods
	 * 
	 */
	
	public void updateEmployee(Employee emp);
	
	/**
	 * Delete Methods
	 * 
	 */
	
	public void deleteEmployee(Employee emp);
	
}
