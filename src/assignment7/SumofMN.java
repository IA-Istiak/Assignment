package assignment7;

import java.util.Scanner;

public class SumofMN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print sum of odd numbers from m-n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int m = sc.nextInt();
		System.out.println("Enter 2nd number:");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = m;i<=n; i++) {
			if(i%2 !=0)  {
				sum = sum+i;
			}
		}
		System.out.println(sum);
		
		for(int i = m; i<=n; i++ ) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
