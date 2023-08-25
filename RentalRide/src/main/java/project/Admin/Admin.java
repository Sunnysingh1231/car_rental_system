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

	public static void viewAllCust() {
		Service s = new ServiceImpl();
		s.viewAllCustomers();
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
	
	public static void deleteCustomer(Scanner sc) {
		
		System.out.println("Enter Customer id");
		int id = sc.nextInt();
		
		
		Service s = new ServiceImpl();
		s.deleteCustomer(id);
	}
	
	public static void viewAllVehicle() {
		Service s = new ServiceImpl();
		s.viewAllVeicle();
	}
	
	public static void deleteVehicle(Scanner sc) {
		
		System.out.println("Enter Vehicle id");
		int id = sc.nextInt();
		
		Service s = new ServiceImpl();
		s.deleteVehicla(id);
	}
	
	public static void viewDeleteCustomer() {
		Service s = new ServiceImpl();
		s.viewAllDeletedCustomers();
	}
	
	public static void viewDeleteVehicle() {
		Service s = new ServiceImpl();
		s.viewAllDeletedVeicle();
	}
}
