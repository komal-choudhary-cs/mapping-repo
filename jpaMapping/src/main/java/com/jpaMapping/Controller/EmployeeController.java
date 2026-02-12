package com.jpaMapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpaMapping.Entity.Employees;
import com.jpaMapping.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping
  public  Employees createEmpl(@RequestBody Employees employees) {
	  
	  return employeeService.createEmplyee(employees);
  }
	
  @DeleteMapping("/id")
  public Employees deleteById(@PathVariable  long id) {
	   return  employeeService.deleteById(id);
  }
}
