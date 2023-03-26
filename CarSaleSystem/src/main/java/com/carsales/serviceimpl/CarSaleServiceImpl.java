package com.carsales.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsales.entity.CarSale;
import com.carsales.entitydto.CarSaleDTO;
import com.carsales.repository.CarSaleRepository;
import com.carsales.service.CarSaleService;
@Service
//Implementation of service interface
public class CarSaleServiceImpl implements CarSaleService 
{
    //Constructor Injection
    @Autowired
    private CarSaleRepository carSaleRepository;
 
    //To Display all the car
	@Override
	public List<CarSale> getAllCarSale() 
	{
		return carSaleRepository.findAll();
	}
	
	//to add the car
	@Override
	public CarSale createCarSale(CarSaleDTO carSaleDTO) 
	{
		CarSale carSale=CarSale.builder().name(carSaleDTO.getName()).price(carSaleDTO.getPrice()).brand(carSaleDTO.getBrand()).build();
		return carSaleRepository.save(carSale);
	}
	
	//To update an car details by their Id
	@Override
	public CarSale updateCarSale(CarSaleDTO carSaleDTO, int id) 
	{
		CarSale _carSale=carSaleRepository.findById(id).get();
		_carSale.setName(carSaleDTO.getName());
		_carSale.setPrice(carSaleDTO.getPrice());
		return carSaleRepository.save(_carSale);
	}

	//to get a car
	@Override
	public CarSale getACarSale(int id)
	{
		return carSaleRepository.findById(id).get();
	}

	//To delete an car by their Id
	@Override
	public String deleteCarById(int id)
	{
		carSaleRepository.deleteById(id);
		return "succefully deleted";
	}

	

}
