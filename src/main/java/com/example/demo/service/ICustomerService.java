package com.example.demo.service;

import java.util.List;

import com.example.demo.model.request.CustomerModelReq;
import com.example.demo.model.response.CustomerModelRes;

public interface ICustomerService {

	int AddCustomer(CustomerModelReq request);

	List<CustomerModelRes> findAllCustomer();

}
