package assignment5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical AND assignment
		// Check eligible candidate
		// Step 1: Ask the candidate have you completed your masters? y/n 
		// Step 2: Ask the candidate are you fulent in English? y/n 
		// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
		// Step 4: else print Sorry. you are not eligible to for the job interview
		
		Scanner sc = new Scanner(System.in);
		System.out.println("have you completed your masters?");
		String ans1 = sc.nextLine();
		System.out.println("are you fulent in English?");
		String ans2 = sc.nextLine();
		if(ans1.equals("y")&& ans2.equals("y")) {
			System.out.println("you are eligible to for the job interview");
		}
		else
			System.out.println("Sorry. you are not eligible to for the job interview");

	}

}
