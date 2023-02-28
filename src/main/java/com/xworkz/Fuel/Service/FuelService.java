package com.xworkz.Fuel.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.Fuel.DTO.FuelDto;

public interface FuelService {
	
	Set<ConstraintViolation<FuelDto>>validateAndSave(FuelDto dto);
	default FuelDto findById(int id) {
		return null;
	}
	default List<FuelDto>findByBrandName(String brandName){
		return Collections.emptyList();
	}
	

}
