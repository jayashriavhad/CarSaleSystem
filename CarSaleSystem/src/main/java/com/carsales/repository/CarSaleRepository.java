package com.carsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsales.entity.CarSale;
//Repository class
public interface CarSaleRepository extends JpaRepository<CarSale, Integer> {

}
