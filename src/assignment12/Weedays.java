package assignment12;

import java.util.Scanner;

public class Weedays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assigment 18 (Print the day name) declare an array of weekdays User will give
		 * a day number you have to print the equivalent day name
		 * 
		 * Example 1 input-> Enter day number (1-7) : 1 output-> Monday
		 * 
		 * Example 2 input-> Enter day number (1-7) : 3 output-> Wednesday
		 */
		String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day number (1-7) :");
		int number = sc.nextInt();
		for(int i = 1; i<=7; i++) {
			if(i==number) {
				String day = weekDays[number-1]; 
				System.out.println(day);
			}
		}

	}

}
