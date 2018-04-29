package com.billpayment.test.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billpayment.test.dao.CustomerDao;
import com.billpayment.test.model.Customer;
import com.billpayment.test.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	/* to save an CustomerDetails*/
	@PostMapping("/saveCustomers")
	public Customer createCustomer(@Valid @RequestBody Customer cus) {
		// use service and serviceImpl methods for bussiness logic or for retriving data
		return customerService.saveCustomer(cus);
	}
	
}
