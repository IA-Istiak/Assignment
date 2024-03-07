package assignment9;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. generate and print palindrome numbers from m-n 
		// 2. count and print number of palindrome numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number start from:");
		int start1 = sc.nextInt();
		System.out.println("Number ends at:");
		int end1 = sc.nextInt();
		int temp =0;
		int rev=0; int r;
		int count =0;
		
		for(int i = start1; i<=end1; i++) {
			
			temp=i;
			rev =0;
			while(temp!=0) {
				 r = temp%10;
				 rev = rev*10+r;
				temp = temp/10;
			}
			if(rev == i) {
				System.out.println("palindrome Number:" + rev);
				count++;
			}
			
			
		}
		System.out.println("Total Palindrome Number:" + count);
		

	}

}
