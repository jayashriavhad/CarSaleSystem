package com.carsales.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="Car")
public class CarSale   //Entity class
{
	// Declaring variables of entity class and adding that variables in table
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CarId")
	private Integer id;
	
	@Column(name="CarName")
	private String name;
	
	@Column(name="CarBrand")
	private String brand;
	
	@Column(name="CarPrice")
	private Integer price;
	
	//many to one relationship
//	@ManyToOne
//	@JoinColumn(name = "customerId")//join the column
//	@JsonBackReference   //linkage between two field,parent and child role
//	private Customer Customer;


	@ManyToOne
	@JoinColumn(name = "customerId")  //join the column
	@JsonBackReference               //linkage between two field,parent and child role
	private Customer customerId; 
}
