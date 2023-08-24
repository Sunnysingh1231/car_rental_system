package project.RentalRide;

import java.util.Scanner;


import project.Admin.Admin;
import project.Dto.Customers;
import project.Service.Service;
import project.Service.ServiceImpl;

public class Main {
	
	
	//----------------------------adminLogin---------------------------
	public static void adminLogin(Scanner sc) {
		System.out.println("Enter Username");
		String userName = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Password");
		String password = sc.next();
		sc.nextLine();
		
		if (userName.equals("a")&&password.equals("a")) {
			System.out.println("Login Successful");
			
			int input = 0;
			
			do {
				
				System.out.println("Please enter your preference");
				System.out.println("1. - Total Registration Details");
				System.out.println("2. - Add Vehical");
//				System.out.println("3. - Update Vehical");
//				System.out.println("4. - Delete Vehical");
//				System.out.println("5. - View all Deleted Vehical");
//				System.out.println("6. - Delete Customer");
//				System.out.println("7. - View all Deleted Customers");
//				System.out.println("0. - Log Out");
				
				input = sc.nextInt();
				
				switch (input) {
				case 1:
					Admin.totalRegistration();
					break;
					
				case 2:
					Admin.addVehicle(sc);
					break;
					
//				case 3:
//					Admin.totalRegistration();
//					break;
//					
//				case 4:
//					Admin.totalRegistration();
//					break;
//					
//				case 5:
//					Admin.totalRegistration();
//					break;
//					
//				case 6:
//					Admin.totalRegistration();
//					break;
//					
//				case 7:
//					Admin.totalRegistration();
//					break;
					
				case 0:
					System.out.println("Log Out Successful");
					break;

				default:
					System.out.println("Invalid Selection");
					break;
				}
				
			} while (input!=0);
			
			
		}
		else {
			System.out.println("Wrong Customers");
		}
	}

	
	
	//----------------------------customerSignup---------------------------
	public static void customerSignup(Scanner sc) {
		
		System.out.println("Enter Your Name");
		String name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter your Email");
		String email = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Mobile Number");
		int mobNumber = sc.nextInt();		
		
		
		System.out.println("Enter Password");
		String password = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Amount");
		double amount = sc.nextDouble();
		
		
		Service s = new ServiceImpl();
		
		Customers c = new Customers(name,email,mobNumber,password,amount);
		
		s.addCustomer(c);
		
	}
	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("+----------------------+");
		System.out.println("| Welcome in RiderRide |");
		System.out.println("+----------------------+");
		System.out.println();

		
		int preference = 0;
		do {
			System.out.println("Please enter your preference");
			System.out.println("1. - Admin login");
			System.out.println("2. - Customer signup");
			System.out.println("3. - Customer login");
			System.out.println("0. - Exit");
			preference = sc.nextInt();
			switch (preference) {
			case 1:
				adminLogin(sc);
				break;
			

			case 2:
				customerSignup(sc);
				break;
				
			case 0:
				System.out.println("Thank You Please visit again");
				break;
				
			default:
				System.out.println("Invalid Selection");
			}

		}

		while (preference != 0);
	
	
	
	}
}
