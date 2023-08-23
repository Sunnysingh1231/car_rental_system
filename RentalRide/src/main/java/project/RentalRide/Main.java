package project.RentalRide;

import java.util.Scanner;

import project.Admin.Admin;

public class Main {
	
	
	//----------------------------adminLogin---------------------------
	public static void adminLogin(Scanner sc) {
		System.out.println("Enter Username");
		String userName = sc.next();
		sc.nextLine();
		
		System.out.println("Enter Password");
		String password = sc.next();
		sc.nextLine();
		
		if (userName.equals("admin")&&password.equals(password)) {
			System.out.println("Login Successful");
			
			int input = 0;
			
			do {
				
				System.out.println("Please enter your preference");
				System.out.println("1. - ");
				System.out.println("2. - ");
				System.out.println("3. - ");
				System.out.println("0. - Log Out");
				
				input = sc.nextInt();
				
				switch (input) {
				case 1:
					Admin.adminPre(sc);
					break;
					
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
			System.out.println("Wrong Credential");
		}
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
//				PasengerSignup(sc, passengers);
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
