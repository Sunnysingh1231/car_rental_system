package project.Utility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Util {

	static EntityManagerFactory emf = null;

	static {
		try {

			emf = Persistence.createEntityManagerFactory("Project");

		} catch (Exception e) {
			System.out.println("Can't connect to DataBase");
		}
	}

	public static EntityManager getConnection() {
		return emf.createEntityManager();
	}
}
