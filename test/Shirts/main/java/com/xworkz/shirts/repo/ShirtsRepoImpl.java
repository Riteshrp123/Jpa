package com.xworkz.shirts.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.shirts.dto.ShirtsDto;

public class ShirtsRepoImpl implements ShirtsRepo {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("shirtsdata");
	private EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(ShirtsDto dto) {
		if(em!=null) {
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	@Override
	public List<ShirtsDto> readAll() {
		if(em!=null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("readAll",ShirtsDto.class);
		 List<ShirtsDto> list = query.getResultList();
			em.getTransaction().commit();
			return list;
		}
		return null;
	}

		}
