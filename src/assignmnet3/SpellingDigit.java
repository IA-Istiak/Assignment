package assignmnet3;

import java.util.Scanner;

public class SpellingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Digit spelling program using if,else if, else
		 * step 1: ask for a digit between 0-9
		 * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
		 * step 3: if the digit is not among 0-9 then print Invalid digit
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit 0-9");
		int digit = sc.nextInt();
		if(digit == 0) 
			System.out.println("Zero");
		else if(digit == 1)
		System.out.println("One");
		else if(digit == 2)
			System.out.println("Two");
		else if(digit == 3)
			System.out.println("Three");
		else if(digit == 4)
			System.out.println("Four");
		else if(digit == 5)
			System.out.println("Five");
		else if(digit == 6)
			System.out.println("Six");
		else if(digit == 7)
			System.out.println("Seven");
		else if(digit == 8)
			System.out.println("Eight");
		else if(digit == 9)
			System.out.println("Nine");
		else
			System.out.println("Invalid Digit");

	}

}
