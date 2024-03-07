package assignment7;

import java.util.Scanner;

public class TablesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//নামতা
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of your Table:");
		int input = sc.nextInt();
		int result = 1;
		System.out.println("Here is the table for :" + input);
		for(int i = 1; i<=10; i++) {
			result = input * i;
			System.out.println(input+" "+ "*" + " "+ i+" " +" = "+" "+result);
		}

	}

}
