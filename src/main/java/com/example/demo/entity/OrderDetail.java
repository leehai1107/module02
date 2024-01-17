package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int OrderDetailID;
	@Column
	private int Quantity;
	@Column
	private float UnitPrice;
	
	@ManyToOne
	@JoinColumn(name="OrderID")
	private Order Order;
	
	@ManyToOne
	@JoinColumn(name = "ProductID")
	private Product Product;

}
