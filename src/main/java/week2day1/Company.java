package week2day1;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the User Details  :");	


		System.out.println("Enter the name :");
		String naMe= a.nextLine();	

		System.out.println("Enter the username :");
		String username=a.nextLine();

		System.out.println("Enter the password :");
		String Password=a.nextLine();

		System.out.println("Enter the mobilenumber :");
		String mobilenumber=a.nextLine();

		System.out.println("Enter the rating :");
		double rating=a.nextInt();
		
		System.out.println("Enter the id :");
		int ID=a.nextInt();
		a.close();
		System.out.println("User details are ");
		System.out.println("Id : "+ID);
		System.out.println("Name : "+naMe);
		System.out.println("Username : "+username);
		System.out.println("Mobile Number : "+mobilenumber);
		System.out.println("Rating : "+rating);



	}

}
