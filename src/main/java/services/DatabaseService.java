package services;

import java.util.List;

import javax.persistence.*;

public class DatabaseService<T> {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	public DatabaseService() {
		entityManagerFactory = Persistence.createEntityManagerFactory("foodmood");
	}
	
	public List<T> getAllRecipes() {
		try {
			if (entityManager.isOpen()) {
				
			}
		} catch (PersistenceException ex) {
			
		}
		return null;
	}
}
