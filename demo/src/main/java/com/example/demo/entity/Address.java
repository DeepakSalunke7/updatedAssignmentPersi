package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	private long addressId;
	
	private String addressType;
	
	private String addressLine1; 
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
}
