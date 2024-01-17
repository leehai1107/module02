package com.example.demo.entity;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CustomerID;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String Email;
	
	@OneToMany(mappedBy = "Customer")
	private Collection<Order> Orders;

}
