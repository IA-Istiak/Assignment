package coditionaloperator;

import java.util.Scanner;

public class ConditionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("first input:");
		int x = sc.nextInt();
		System.out.println("2nd input:");
		int y = sc.nextInt();
		
		int large = (x>y)?x:y;
		System.out.println(large);

	}

}
