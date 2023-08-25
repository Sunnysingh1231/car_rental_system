package project.RentalRide;

import java.util.Scanner;

import project.Admin.Admin;
import project.Admin.Customer;
import project.Dao.DaoImpl;
import project.Dto.Customers;
import project.Service.Service;
import project.Service.ServiceImpl;

public class Main {

	// ----------------------------adminLogin---------------------------
	public static void adminLogin(Scanner sc) {
		System.out.println("Enter Username");
		String userName = sc.next();
		sc.nextLine();

		System.out.println("Enter Password");
		String password = sc.next();
		sc.nextLine();

		if (userName.equals("a") && password.equals("a")) {
			System.out.println("Login Successful");

			int input = 0;

			do {

				System.out.println("Please enter your preference");
				System.out.println("1. - View all Registration");
				System.out.println("2. - View all Vehicals");
				System.out.println("3. - Add Vehical");
//				System.out.println("4. - Update Vehical");
				System.out.println("5. - Delete Vehical");
//				System.out.println("6. - View all Deleted Vehical");
				System.out.println("7. - Delete Customer");
				System.out.println("8. - View all Deleted Customers");
				System.out.println("9. - View all Deleted Vehivle");
				System.out.println("0. - Log Out");

				input = sc.nextInt();

				switch (input) {
				case 1:
					Admin.viewAllCust();
					break;

				case 2:
					Admin.viewAllVehicle();
					break;

				case 3:
					Admin.addVehicle(sc);
					break;

//				case 4:
//					Admin.totalRegistration();
//					break;
//					
				case 5:
					Admin.deleteVehicle(sc);
					break;

//				case 6:
//					Admin.totalRegistration();
//					break;
//					
				case 7:
					Admin.deleteCustomer(sc);
					break;

				case 8:
					Admin.viewDeleteCustomer();
					break;

				case 9:
					Admin.viewDeleteVehicle();
					break;

				case 0:
					System.out.println("Admin Log Out Successful");
					break;

				default:
					System.out.println("Invalid Selection");
					break;
				}

			} while (input != 0);

		} else {
			System.out.println("Wrong Customers");
		}
	}

	// ----------------------------customerSignup---------------------------
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

		Customers c = new Customers(name, email, mobNumber, password, amount);

		s.addCustomer(c);

	}
	
	// ----------------------------customerLogin---------------------------
	
	public static void customerLogin(Scanner sc) {

		System.out.println("Enter your Email");
		String email = sc.next();
		sc.nextLine();

		System.out.println("Enter Password");
		String password = sc.next();
		sc.nextLine();
		
		Customer.customerLogin(sc, email,password);
		
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
				
			case 3:
				customerLogin(sc);
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
