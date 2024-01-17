package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.request.CustomerModelReq;
import com.example.demo.model.response.CustomerModelRes;
import com.example.demo.service.ICustomerService;

@RestController
@RequestMapping("v1/customer")
public class CustomerController {
	@Autowired
	ICustomerService customerService;
	
	@PostMapping(value = "/add")
	public int AddCustomer(@RequestBody CustomerModelReq request) {
		return customerService.AddCustomer(request);
	}
	
	@GetMapping("/all")
	public List<CustomerModelRes> findAllCustomer(){
		return customerService.findAllCustomer();
	}

}
