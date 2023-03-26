package com.carsales.service;

import java.util.List;

import com.carsales.entity.CarSale;
import com.carsales.entitydto.CarSaleDTO;

public interface CarSaleService //service interface
{
	//  Adding car 
	CarSale createCarSale(CarSaleDTO c);
	
	// Update car detail
	CarSale updateCarSale(CarSaleDTO carSaleDTO, int id);

	//getting Single car detail
	CarSale getACarSale(int id);
	
	//Delete the car
	String deleteCarById (int id);

	//Getting All car 
	List<CarSale> getAllCarSale();	
	
}
