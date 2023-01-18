package com.xworkz.solider.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.solider.dto.SoliderDTO;
import com.xworkz.solider.repo.SoliderRepo;

public class SoliderServiceImpl implements SoliderService{
	
	private SoliderRepo soliderrepo;
	
	public SoliderServiceImpl() {

		System.out.println("Created SoliderServiceImpl using no-org const..");
	}
	public void setSoliderRepo(SoliderRepo soliderrepo) {
		this.soliderrepo =soliderrepo;
	}
	

	@Override
	public boolean save(SoliderDTO dto) {
		System.out.println("starting validateAndSave");
		System.out.println("dto passed:"+dto);
	ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
	Validator validator=factory.getValidator();
	Set<ConstraintViolation<SoliderDTO>> violations=validator.validate(dto);
	if(!violations.isEmpty()) {
		System.err.println("There are validation errors..");
		
		
		violations.forEach(v ->{
			System.err.println("violating message"+v.getMessage());
			
		}
		);
		return false;
		
	}
	else {
		System.out.println("Data is valid...");
		return true;
	}
	
	}
	
	

}
