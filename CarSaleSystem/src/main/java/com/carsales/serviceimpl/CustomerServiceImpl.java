package com.carsales.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsales.entity.Customer;

import com.carsales.entitydto.CustomerDTO;
import com.carsales.repository.CustomerRepository;
import com.carsales.service.CustomerService;

@Service
//Implementation of service interface
public class CustomerServiceImpl  implements CustomerService
{
	//constructor injection
	@Autowired
	private CustomerRepository customerrepository;

	//To add a customer
	@Override
	public Customer addCustomer(CustomerDTO customerdto)
	{
		Customer customer = Customer.builder().customer_name(customerdto.getCustomer_name())
				.contact_no((String) customerdto.getContact_no())
				.email(customerdto.getEmail()).build();
			return customerrepository.save(customer);
			}
	
   //find a customer by their id
	@Override
	public Customer getACustomerById(int id)
	{
		return customerrepository.findById(id).get();
	}

	//To update an customer details by their Id
	@Override
	public Customer update(Customer customer, int id) 
	{
		Customer _customer = customerrepository.findById(id).get();
		_customer.setCustomer_name(customer.getCustomer_name());
		_customer.setContact_no(customer.getContact_no());
		_customer.setEmail(customer.getEmail());
		return customerrepository.save(_customer);
	}

	//To delete an customer by their Id
	@Override
	public String delete(int id) 
	{
		customerrepository.deleteById(id);
		return "The Customer with id " + id + " has deleted!!";
	}
	
	
}
