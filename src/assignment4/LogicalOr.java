package assignment4;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Logical or assignment
		// step 1: Print "Do you love java? "
		// step 2: take user input y / Y / n / N
		// step 3: if user input y / Y then print you are a java lover
		// step 4: if user input n / N then print you are not a java lover
		
		System.out.println("Do you Love Java?");
		Scanner df = new Scanner(System.in);
		
		String input = df.next();
		if(input.equals("y")|| input.equals("Y")) {
			System.out.println("you are a java lover");
		}
		else if(input.equals("n")|| input.equals("N")) {
			System.out.println("you are not a java lover");
		}
		else {
			System.out.println("Invalid");
		}
		
		

	}

}
