package com.billpayment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billpayment.dao.CustomerDao;
import com.billpayment.model.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer cus);
	public Customer updateCustomer(Customer cus);
	public List<Customer> findAll();
	
}
