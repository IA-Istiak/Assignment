package assignment2;

import java.util.Scanner;

public class ValidVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * valid voter program using if,else 
		 * step 1: ask for a person age
		 * step 2: if age is equal or more than 18 than print valid voter
		 * step 3: else print invalid voter
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("valid voter");
		}
		else
			System.out.println("Invalid voter");

	}

}
