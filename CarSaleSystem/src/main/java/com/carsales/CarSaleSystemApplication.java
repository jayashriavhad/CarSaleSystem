package com.carsales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carsales.entity.CarSale;
import com.carsales.entity.Customer;
import com.carsales.repository.CarSaleRepository;
import com.carsales.repository.CustomerRepository;

@SpringBootApplication
public class CarSaleSystemApplication implements CommandLineRunner {
 @Autowired
 private CustomerRepository customerrepository;
 
 //constructor injection
 @Autowired
 private CarSaleRepository carsalerepository;
 
 	//main class
	public static void main(String[] args) 
	{
		SpringApplication.run(CarSaleSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Adding Dummy data for testing
		
		//create customer object
		Customer c1 = Customer.builder().customerId(111).customer_name("Jayshri").contact_no("4144141411").email("jay@gmail.com")
				.build();
		
		//save the customer object 
		customerrepository.save(c1);
		
		//create car object
		CarSale s1=CarSale.builder().name("BMW").price(20000).brand("BMW Motorrad").build();
		CarSale s2=CarSale.builder().name("suzuki").price(45000).brand("maruti").build();
		CarSale s3=CarSale.builder().name("alto").price(25000).brand("Alto ").build();

		//save the car object 
		carsalerepository.save(s1);
		carsalerepository.save(s2);
		carsalerepository.save(s3);
			
//		c1.setCarSale(Arrays.asList(s1, s2,s3));
//		customerrepository.save(c1);
  
		System.out.println("----------------------------- Save all ----------------------------");
	}

}
