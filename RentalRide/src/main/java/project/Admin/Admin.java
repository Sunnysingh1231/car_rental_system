package project.Admin;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import project.Dto.Customers;
import project.Dto.Vehicle;
import project.Service.Service;
import project.Service.ServiceImpl;
import project.Utility.Util;

public class Admin {

	public static void totalRegistration() {
	    EntityManager em = null;
	    List<Customers> c = null;

	    try {
	        em = Util.getConnection();
	        EntityTransaction et = em.getTransaction();
	        
	        et.begin(); 

	        TypedQuery<Customers> tq = em.createQuery("SELECT c FROM Customers c", Customers.class);
	        c = tq.getResultList();

	        for (Customers data : c) {
	        	System.out.println("+--------------------------------------------------------------------------------------------------+");
	            System.out.println("|"+data);
	        	System.out.println("+--------------------------------------------------------------------------------------------------+");
	        }

	        et.commit();

	    } catch (Exception e) {
	        System.out.println("Something went wrong: " + e.getMessage());
	        if (em != null && em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	    } finally {
	        if (em != null) {
	            em.close();
	        }
	    }
	}


	public static void addVehicle(Scanner sc) {
		
		System.out.println("Enter Vehicle Name");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Vehicle Type");
		String type = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Vehicle Brand");
		String brand = sc.next();		
		sc.nextLine();
		
		System.out.println("Enter Vehicle Price/KM");
		double password = sc.nextDouble();
		
		System.out.println("Enter Vehicle Manufacture Date");
		LocalDate date = LocalDate.parse(sc.next());
		sc.nextLine();
		
		Service s = new ServiceImpl();
		
		Vehicle v = new Vehicle(name,type,brand,password,date);
		
		s.addVehicle(v);
		
	}
}
