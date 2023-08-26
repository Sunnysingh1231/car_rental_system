package project.Admin;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import project.Dto.Customers;
import project.Service.Service;
import project.Service.ServiceImpl;
import project.Utility.Util;

public class Customer {

	int id = 0;
	String name = null;
	String emm = null;
	int mobileNo = 0;
	double m = 0;
	 
	public static void customerLogin(Scanner sc, String e,String p) {
		
		EntityManager em = null;
		List<Customers> c = null;
		
		int id = 0;
		String name = null;
		String emm = null;
		int mobileNo = 0;
		double m = 0;
		

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
						System.out.println("+---------------------------------------------------------------------------------------------------------+");
						id = data.getId();
						name = data.getName();
						emm = data.getEmail();
						mobileNo = data.getMobileNumber();
						m = data.getMoney();
						System.out.println("+---------------------------------------------------------------------------------------------------------+");
						break;
//						return;
					}
				}
				
				if(fString.equals("y")) {
					System.out.println("+------------------+");
					System.out.println("| Login Successful |");
					System.out.println("+------------------+");
					System.out.println("Customer [Id="+id+ " Name="+name +" Email="+emm+" Mobile No.="+mobileNo+" wallet balance="+m);
					
					int n = 0;
					
					do {
						
						System.out.println("1. Add money to Wallet");
						System.out.println("2. Withdraw money");
						System.out.println("3. Availability of Vehicle");
						System.out.println("4. ");
						System.out.println("log Out");
						
						n = sc.nextInt();
						
						switch (n) {
						
						case 1:
							addMoney(sc,id);
							break;
							
						case 2:
							withdraw(sc,id);
							break;
							
						case 3:
							vehicleAvailability();
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
	
	public static void vehicleAvailability() {
		Service s = new ServiceImpl();
		s.vehicleAvailability();
	}
	
	public static void addMoney(Scanner sc,int id) {
		
		System.out.println("Enter Money");
		double m = sc.nextDouble();
		
		Service s = new ServiceImpl();
		s.addMoney(id, m);
		
	}
	
	public static void withdraw(Scanner sc,int id) {
		
		System.out.println("Enter Money");
		double m = sc.nextDouble();
		
		Service s = new ServiceImpl();
		s.withdraw(id, m);
		
	}
		
}
