package com.xworkz.Fuel.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;
import com.xworkz.Fuel.Entity.FuelEntity;

@Repository
public class FuelRepositoryImpl implements FuelRepository {
	@Autowired
	private EntityManagerFactory entity;

	@Override
	public boolean save(FuelEntity fuelEntity) {
		System.out.println(" Running save in FuelRepositoryImpl");
		
		EntityManager manager=this.entity.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(fuelEntity);
		transaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<FuelEntity> findByBrandName(String brandName) {
		EntityManager manager=this.entity.createEntityManager();
		try {
			javax.persistence.Query query=manager.createNamedQuery("findByBrandName");
			query.setParameter("comp",brandName);
			System.out.println("query:"+query);
			List<FuelEntity>list=query.getResultList();
			System.out.println("Total list found in repo"+list.size());
		
		return list;
	}finally {
		manager.close();
		System.out.println("Realesed the connection...");
	}

}
}
