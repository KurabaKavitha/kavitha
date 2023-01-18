package com.xworkz.solider.repo;

import com.xworkz.solider.dto.SoliderDTO;

public  class SoliderRepoImpl implements SoliderRepo {
	
	public SoliderRepoImpl() {
		System.out.println(" created SoliderRepoImpl using no-org const...");
	}
	@Override
	public boolean save(SoliderDTO dto) {
		System.out.println("running save");
		System.out.println("DTO"+dto);
		return false;
		
	}

}
