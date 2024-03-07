package assignment11;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a pattern like following one if n=4
		/*
		 1
		 1 0
		 1 0 1
		 1 0 1 0
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row num");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++){
			for(int j = 1 ; j<=i ;j++) {
				if(j%2 == 0) {
					System.out.print("0");
				}
				else
					System.out.print("1");
			}
			System.out.println();
		}

	}

}
