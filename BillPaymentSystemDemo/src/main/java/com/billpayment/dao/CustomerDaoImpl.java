package com.billpayment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.billpayment.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	private SessionFactory sf;
	
	
	@Override
	public Customer updateCustomer(Customer cus) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(cus);
		return cus;
	}

	@Override
	public Customer saveCustomer(Customer cus) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(cus);
		return cus;
	}

	@Override
	 public List<Customer> findAll() {
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<Customer> customer = ((CustomerDaoImpl) session).findAll();
		return customer;
		
		      
		
		      
		    }


	
	

}
