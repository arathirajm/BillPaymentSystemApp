package com.billpayment.test.dao;

import org.springframework.stereotype.Service;

import com.billpayment.test.model.Customer;

public interface CustomerDao {
	
	public Customer saveCustomer(Customer emp);
	
}
