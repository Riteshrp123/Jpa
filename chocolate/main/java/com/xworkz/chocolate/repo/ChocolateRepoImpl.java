package com.xworkz.chocolate.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.chocolate.dto.ChocolateDto;

public class ChocolateRepoImpl implements ChocolateRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("databaseProperties");
	private EntityManager em = emf.createEntityManager();

	public boolean createAll(ChocolateDto dto) {
		if (dto != null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public List<ChocolateDto> readAll() {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll", ChocolateDto.class);
			em.getTransaction().commit();
			return query.getResultList();

		}
		return null;
	}

	public ChocolateDto findByColorAndWeight(String color, int weight) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByColorAndWeight", ChocolateDto.class);
			query.setParameter("col", color);
			query.setParameter("wh", weight);
			return (ChocolateDto) query.getSingleResult();
		}
		return null;
	}

	public ChocolateDto findByPriceAndName(int price, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("findByPriceAndName", ChocolateDto.class);
			query.setParameter("pr", price);
			query.setParameter("nm", name);
			return (ChocolateDto) query.getSingleResult();
		}
		return null;
	}

	public boolean updateWeightByNameAndColor(int weight, String name, String color) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateWeightByNameAndColor");
			query.setParameter("wh", weight);
			query.setParameter("nm", name);
			query.setParameter("col", color);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean updateNameByIdAndWeight(String name, int id, int weight) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("updateNameByIdAndWeight");
			query.setParameter("nm", name);
			query.setParameter("id", id);
			query.setParameter("wh", weight);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean DeleteBycolorAndName(String color, String name) {
		if (em != null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("DeleteBycolorAndName");
			query.setParameter("col", color);
			query.setParameter("nm", name);
			query.executeUpdate();
			em.getTransaction().commit();
			return true;

		}
		return false;
	}
}
