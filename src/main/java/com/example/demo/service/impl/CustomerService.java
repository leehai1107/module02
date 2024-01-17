package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.CustomerConverter;
import com.example.demo.entity.Customer;
import com.example.demo.model.request.CustomerModelReq;
import com.example.demo.model.response.CustomerModelRes;
import com.example.demo.repository.CustomerRepo;
import com.example.demo.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService{

	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	CustomerConverter converter;
	
	@Override
	public int AddCustomer(CustomerModelReq request) {
		Customer data = converter.toEntity(request);
		data =customerRepo.save(data);
		
		return data.getCustomerID();
	}
	
	@Override
	public List<CustomerModelRes> findAllCustomer() {
        List<Customer> data = customerRepo.findAll();
        return data.stream()
                .map(converter::toModel)
                .collect(Collectors.toList());
    }
	
}
