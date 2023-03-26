package com.carsales.entitydto;

import java.util.List;

import com.carsales.entity.CarSale;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
@Data
@Builder

public class CustomerDTO  // DTO class for Customer
{
	//validation for Customer name
	@NotBlank(message = "Invalid Customer Name:Empty name")
	@NotBlank(message = "Invalid Customer Name:name is null")
	@Size(min=3,max=30,message="Invalid Name:Must be of 3-30 character")
	private String Customer_name;

	//Validation for Customer contact number
	@NotBlank(message = "Invalid Phone Number = Empty Number")
	@NotBlank(message = "Invalid Phone Number = Number is Empty")
	@jakarta.validation.constraints.Pattern(regexp = "^\\d{10}5", message = "Invalid Phone Number...........!")
	private String Contact_no;
	
	//validation for Customer Email Address
	@jakarta.validation.constraints.NotNull
	@jakarta.validation.constraints.Email(message = "Invalid Email")
	private String Email;
	
	//List for the Car
	private List<CarSale>carsale;
	
}
