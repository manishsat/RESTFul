package com.scb.resftful.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.scb.restful.service.EmployeeService;

@Path("/employee")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	

	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({ MediaType.TEXT_HTML })
	public Response createEmployee(Employee emp) {
		long empId = employeeService.createEmployee(emp);
		return Response.status(Response.Status.CREATED)
				.entity("Employee has been created")
				.header("Location", "" + empId).build();
	}
	
	/**
	 * List of employees resources provided in json format will be added.
	 * @param employees
	 * @return
	 * @throws EmployeeException
	 */
	 
	public Response createEmployees(List<Employee> employees) {
		employeeService.createEmployee(employees);
		return Response.status(Response.Status.CREATED)
				.entity("All employees are stored").build();
		
		
	}
	
	/**
	 * Return employee by id
	 * @return
	 */
	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response getPodcastById(@PathParam("id") Long empId){
		employeeService.getEmployee(empId);
		return Response.status(200).build();
	}
	
}
