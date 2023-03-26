package com.carsales.service;

import com.carsales.entity.Customer;
import com.carsales.entitydto.CustomerDTO;

public interface CustomerService //Service interface
{
	//Adding customer 
	Customer addCustomer(CustomerDTO customerdto);
	
	//getting Single customer detail
	Customer getACustomerById(int id);
	
	// Update customer detail
	Customer update(Customer customer,int customerId);
	
	//Delete the customer
	String delete(int id);
}
