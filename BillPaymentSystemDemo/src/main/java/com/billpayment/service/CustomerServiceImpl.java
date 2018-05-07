package com.billpayment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billpayment.dao.CustomerDaoImpl;
import com.billpayment.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	com.billpayment.dao.CustomerDao CustomerDao;

	@Override
	public Customer updateCustomer(Customer cus) {
		// TODO Auto-generated method stub
		return CustomerDao.updateCustomer(cus);
	}

	@Override
	public Customer saveCustomer(Customer cus) {
		// TODO Auto-generated method stub
		return CustomerDao.saveCustomer(cus);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return CustomerDao.findAll();
	}

}
