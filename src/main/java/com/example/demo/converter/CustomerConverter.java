package com.example.demo.converter;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Customer;
import com.example.demo.model.request.CustomerModelReq;
import com.example.demo.model.response.CustomerModelRes;

@Component
public class CustomerConverter {
	public Customer toEntity(CustomerModelRes model) {
		Customer entity = new Customer();
		entity.setCustomerID(model.getCustomerID());
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setEmail(model.getEmail());
		return entity;
	}

	public CustomerModelRes toModel(Customer entity) {
		CustomerModelRes model = new CustomerModelRes();
		model.setCustomerID(entity.getCustomerID());
		model.setFirstName(entity.getFirstName());
		model.setLastName(entity.getLastName());
		model.setEmail(entity.getEmail());
		return model;
	}
	
	public Customer toEntity(CustomerModelReq model) {
		Customer entity = new Customer();
		entity.setFirstName(model.getFirstName());
		entity.setLastName(model.getLastName());
		entity.setEmail(model.getEmail());
		return entity;
	}
	

}
