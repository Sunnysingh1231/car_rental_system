package project.Admin;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import project.Dto.Customers;
import project.Utility.Util;

public class Customer {

	public static void customerLogin(Scanner sc, String e,String p) {
		
		EntityManager em = null;
		List<Customers> c = null;

		try {
			em = Util.getConnection();
			EntityTransaction et = em.getTransaction();

			et.begin();

			TypedQuery<Customers> tq = em.createQuery("SELECT c FROM Customers c", Customers.class);
			c = tq.getResultList();

			String fString="n";
{
				for (Customers data : c) {
				
					if(data.isDelete() == false&& data.getEmail().equals(e)&&data.getPassword().equals(p)) {
						
						fString = "y";

					}
				}
				
				if(fString.equals("y")) {
					System.out.println("+------------------+");
					System.out.println("| Login Successful |");
					System.out.println("+------------------+");
					
					int n = 0;
					
					do {
						
						System.out.println("1");
						System.out.println("2");
						System.out.println("3");
						System.out.println("4");
						System.out.println("log Out");
						
						n = sc.nextInt();
						
						switch (n) {
						
						case 1:
							System.out.println("i am 1");
							break;
							
						case 2:
							System.out.println("i am 2");
							break;
							
						case 3:
							System.out.println("i am 3");
							break;
							
						case 4:
							System.out.println("i am 4");
							break;

						default:
							break;
						}
						
					} while (n!=0);
					
				}
				else {
					System.out.println("+------------------------------------+");
					System.out.println("| Wrong Credentials please try again |");
					System.out.println("+------------------------------------+");
				}
				
			}

			et.commit();

		} catch (Exception f) {
			System.out.println("Something went wrong: " + f.getMessage());
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}
		
}
