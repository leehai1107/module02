package com.example.demo.entity;

import java.util.Collection;

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
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProductID;
	@Column
	private String ProductName;
	@Column
	private float ProductPrice;
	@Column
	private int StockQuantity ;
	
	@ManyToOne
	@JoinColumn(name = "CategoryID")
	private Category Category;
	
	@OneToMany(mappedBy = "Product")
	private Collection<OrderDetail> OrderDetails;

}
