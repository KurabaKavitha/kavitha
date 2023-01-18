package com.xworkz.solider.Bean;

import com.xworkz.solider.dto.SoliderDTO;
import com.xworkz.solider.repo.SoliderRepo;
import com.xworkz.solider.repo.SoliderRepoImpl;
import com.xworkz.solider.service.SoliderServiceImpl;

public class Runner {
	
	public static void main(String[] args) {
		SoliderDTO dto = new SoliderDTO("kavitha",1,"Topper","xworkz","banglore");
		
		SoliderServiceImpl ser= new SoliderServiceImpl();
		SoliderRepo repo= new SoliderRepoImpl();
		ser.setSoliderRepo(repo);
		ser.save(dto);
	}

}
