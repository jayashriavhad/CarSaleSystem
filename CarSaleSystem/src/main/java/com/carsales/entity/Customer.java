package com.carsales.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "Customer")
public class Customer 
{
	// Declaring variables of entity class and adding that variables in table
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "customerId")
	private int customerId;
	
	@Column(name = "cust_name", length = 30)
	private String customer_name;
	
	@Column(name = "contact_no", length = 10)
	private String contact_no;
	
	@Column(name = "Email", length = 30)
	private String email;
	
	//one to many relationship
	@OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)
	//crate a List for car
	private List<CarSale> carSale ;
	
}
