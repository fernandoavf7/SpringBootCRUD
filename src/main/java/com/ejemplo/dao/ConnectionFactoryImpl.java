package com.ejemplo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;


@Component("connectionFactory")
public class ConnectionFactoryImpl implements ConnectionFactory {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("miBaseDatos");
	
	public EntityManager openConnection() {
		return emf.createEntityManager();	
	}

	public void closeConnection() {
		emf.close();
	}

}
