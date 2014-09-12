package com.scb.restful.service;

import java.util.List;

import com.scb.resftful.resource.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	public long createEmployee(Employee e) {
		return 1;
	}

	public void createEmployee(List<Employee> employees) {
		// TODO Auto-generated method stub
		
	}

	public Employee getEmployee(long employeeId) {
		return new Employee(1, "Manish", "Satwani", "Changi", 
				new Employee(2, "Tarik", "Sassi", "CBD", null));
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

}
