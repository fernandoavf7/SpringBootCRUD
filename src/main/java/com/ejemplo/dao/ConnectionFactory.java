package com.ejemplo.dao;

import javax.persistence.EntityManager;

public interface ConnectionFactory {
	
	EntityManager openConnection();
	
	void closeConnection();

}
