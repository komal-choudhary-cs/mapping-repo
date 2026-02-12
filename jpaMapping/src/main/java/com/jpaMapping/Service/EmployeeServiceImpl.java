package com.jpaMapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpaMapping.Entity.Employees;
import com.jpaMapping.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements  EmployeeService {
 @Autowired
 private EmployeeRepository employeeRepository;
  

	
	@Override
	public Employees createEmplyee(Employees employees) {
		 return  employeeRepository.save(employees);
		
	}

	 @Override
	    public Employees deleteById(long id) {
	      Employees employees = employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("employee not found"));
	      return employees;
	    }



	
}
