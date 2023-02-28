package com.xworkz.Fuel.Repository;

import java.util.List;

import com.xworkz.Fuel.Entity.FuelEntity;

public interface FuelRepository {
	boolean save(FuelEntity fuelEntity);
	default FuelEntity find(int id) {
		return null;
	}
	List<FuelEntity> findByBrandName(String brandName);

}
