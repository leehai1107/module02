package com.example.demo.entity;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderID;
	@Column
	private Date OrderDate;
	@Column
	private float TotalAmount;
	
	@ManyToOne
	@JoinColumn(name = "CustomerID")
	private Customer Customer;
	
	@OneToMany(mappedBy = "Order")
	private Collection<OrderDetail> OrderDetails;

}
