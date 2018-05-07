package com.billpayment.dao;


import java.util.List;

import com.billpayment.model.Customer;

public interface CustomerDao {
	public List<Customer> findAll();
	
	public Customer saveCustomer(Customer cus);
	
	public Customer updateCustomer(Customer cus); 

}
