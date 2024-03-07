package assignment7;

import java.util.Scanner;

public class FactrialNmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find factorial of n
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int factN =1 ;
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) {
			factN *=i;
		}
		System.out.println(factN);

	}

}
