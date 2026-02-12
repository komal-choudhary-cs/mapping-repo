package com.jpaMapping.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employees {
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name="employee_id")
	private Long  eid;
  @Column(name = "employee_name")
	private String empName;
  
	@OneToMany(cascade=CascadeType.ALL)
	private List<Project> projects;
	
}
