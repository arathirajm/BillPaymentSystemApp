package com.billpayment.controller;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.billpayment.model.Customer;
import com.billpayment.service.CustomerService;

@RestController(value="/Customer")
@ComponentScan(basePackages="com.billpayment")
public class CustomerController {
	@Autowired
	CustomerService cusService;
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	@ResponseBody
	public Customer SaveCustomer(@RequestBody Customer cus) {
		
		return cusService.saveCustomer(cus);	
	}
	
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
	@ResponseBody
	public Customer updateCustomer(@RequestBody Customer cus) {
		
		return cusService.updateCustomer(cus);	
	}
	@RequestMapping(value = "/findAllCustomer", method = RequestMethod.GET)
	@ResponseBody
	public List findAll() {
		// TODO Auto-generated method stub
		return (List) cusService.findAll();
	}
	
}
