package com.jpaMapping.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaMapping.Entity.Employees;

public interface EmployeeRepository extends JpaRepository < Employees ,Long> {

	Employees deleteById(long id);
}

	