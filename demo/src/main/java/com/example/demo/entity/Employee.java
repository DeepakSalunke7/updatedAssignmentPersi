package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id																														
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)	
	private long employeeId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Department department;
	
	private String name;
	
	private String designation;
	
	private double salary;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name= "ea_fk_employeeId",referencedColumnName = "employeeId")
	//(mappedBy = "employeeId", cascade = CascadeType.ALL)
	private List<Address> address;
	
}
