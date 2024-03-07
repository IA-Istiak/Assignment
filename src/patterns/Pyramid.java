package patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row = sc.nextInt();
		for(int i =1 ; i <= row; i++) {
			//now need to create space
			for(int col = 1; col<=row-i; col++) {
				System.out.print(" ");
			}
				//now need to print *
				for(int p = 1; p<=2*i-1; p++) {
					System.out.print("*");
				}
					
			
			System.out.println();
		}
		
		for(int i =row ; i >= 1; i--) {
			//now need to create space
			for(int col = 1; col<=row-i; col++) {
				System.out.print(" ");
			}
				//now need to print *
				for(int p = 1; p<=2*i-1; p++) {
					System.out.print("*");
				}
					
			
			System.out.println();
		}
		

	}

}
