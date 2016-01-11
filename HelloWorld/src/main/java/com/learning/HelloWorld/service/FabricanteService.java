package com.learning.HelloWorld.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.learning.HelloWorld.model.Fabricante;

@Service
public class FabricanteService {

	@PersistenceContext
	private EntityManager em; 
	
	public void create(Fabricante fabricante){
		em.persist(fabricante);
	}
}
