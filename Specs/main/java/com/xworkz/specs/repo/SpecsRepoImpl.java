package com.xworkz.specs.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.specs.dto.SpecsDto;

public class SpecsRepoImpl implements SpecsRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	private EntityManager em = emf.createEntityManager();

	public boolean storeAll(SpecsDto dto) {
		if (dto != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public List<SpecsDto> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", SpecsDto.class);
			List list = query.getResultList();
			em.getTransaction().commit();
			return list;

		}
		return null;
	}

	public SpecsDto findByShapeAndPrice(String shape, int price) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByShapeAndPrice", SpecsDto.class);
			query.setParameter("sp", shape);
			query.setParameter("pr", price);
			return (SpecsDto) query.getSingleResult();
		}
		return null;
	}

	public boolean updatePriceByName(int price, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updatePriceByName");
			query.setParameter("pr", price);
			query.setParameter("nm", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}

	public boolean updateColorByPriceAndShape(String color, int price, String shape) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateColorByPriceAndShape");
			query.setParameter("col", color);
			query.setParameter("pri", price);
			query.setParameter("shp", shape);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean deleteByPriceAndColor(int price, String color) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPriceAndColor");
			query.setParameter("pr", price);
			query.setParameter("col", color);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;

	}

	public boolean deleteByNameAndId(String name, int id) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}
}
