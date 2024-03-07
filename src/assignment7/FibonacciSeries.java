package assignment7;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 //	hint = 0112358...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of fibonacciSeries:");
		int length = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		int fib ;
		System.out.print(num1 +" "+num2);
		for(int i =3; i<=length; i++) {
			fib = num1 + num2;
			num1 = num2;
			num2 = fib;
			System.out.print(" "+fib);
			
			
		}
		

	}

}
