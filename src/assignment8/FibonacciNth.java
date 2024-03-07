package assignment8;

import java.util.Scanner;

public class FibonacciNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find nth fibonacci number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int nth = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int fibo ;
		
		for(int i =3; i<=nth;i++) {
			fibo = num1 + num2;
			num1 = num2;
			num2 = fibo;
			if(i == nth) {
				System.out.println("The "+nth+"th fibonacci number is "+ fibo);
			}
		}
	}

}
