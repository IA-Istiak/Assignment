package assignment7;

import java.util.Scanner;

public class PrimeNumBer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find it is Prime or not");
		int num = sc.nextInt();
		int count = 0;
		
		
		for(int i = 1; i<num; i++  ) {
			if(num%i == 0 && i!=1) {
				
				System.out.println("First number that is dividable is" + i);
				count++;
				
				break;
			}
			
		}
		if(count==0) {
			System.out.println(num + " is  a Prime");
		}else 
			System.out.println(num + " is not a Prime");
		
		
		

	}

}
