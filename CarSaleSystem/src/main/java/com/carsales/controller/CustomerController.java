package com.carsales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsales.entity.Customer;
import com.carsales.entitydto.CustomerDTO;
import com.carsales.service.CustomerService;

@RestController
@RequestMapping(value="/customerdetails")
public class CustomerController    // Controller class
{  
	//Constructor Injection
	@Autowired
	private CustomerService customerservice;
	
	//Getting all customer details
	@GetMapping("/customer/{id}")
	public Customer getDoctorById(@PathVariable int id) {
		return customerservice.getACustomerById(id);
		
	}
	
	//Adding a new customer for car
	@PostMapping("/customer")
	public ResponseEntity<Customer>addCustomer(@RequestBody CustomerDTO customerdto)
	{
		return new ResponseEntity<>(customerservice.addCustomer(customerdto), HttpStatus.CREATED);
		
	}
	
	//update customer details
	@PutMapping("/customer/{id}")
	public Customer updateCustomer (@PathVariable int id,@RequestBody Customer customer)
	{
		return customerservice.update(customer, id);
	}
	
	//delete the customer
	@DeleteMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		return customerservice.delete(id);
		
	}
	

}
