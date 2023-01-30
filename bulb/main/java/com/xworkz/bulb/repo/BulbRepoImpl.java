package com.xworkz.bulb.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import com.xworkz.bulb.dto.BulbDto;

public class BulbRepoImpl implements BulbRepo {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean createAll(BulbDto dto) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public List<BulbDto> readAll() {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
			Query query = (Query) entityManager.createNamedQuery("readAll", BulbDto.class);
			List list = query.getResultList();
			entityManager.getTransaction().commit();
			return list;

		}
		return null;
	}

	public BulbDto findByBrandName(String brandName) {
		if (entityManager != null) {
			entityManager.getTransaction().begin();
		  Query	query = (Query) entityManager.createNamedQuery("findByName", BulbDto.class);
			query.setParameter("nm", brandName);
			return (BulbDto) query.getSingleResult();

		}
		return null;
	}

}
