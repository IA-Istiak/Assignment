package System.out;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. generate and print armstrong numbers from m-n 
		// 2. count and print number of armstrong numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		int start = sc.nextInt();
		System.out.println("End");
		int end = sc.nextInt();
		
		int temp = 0;
		int sum = 0;
		int r,count=0;
		
		for(int i = start; i<= end ; i++) {
			temp = i;
			sum =0;
			while(temp!=0) {
				r = temp%10;
				sum = sum +(r*r*r);
				temp = temp/10;
			}
			
			if(i == sum) {
				System.out.print(sum + ", ");
				count++;
			}
		}
		System.out.println("Total armstrong " + count);

	}

}
