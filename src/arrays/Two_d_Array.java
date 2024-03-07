package arrays;

import java.util.Scanner;

public class Two_d_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][]A = new int[2][3];
		int[][]B = new int[2][3];
		int[][]C = new int[2][3];
		//input A matrix
		for(int row = 0; row<2;row++) {
			for(int col = 0; col<3;col++) {
				System.out.printf("A[%d][%d] = ",row,col);
			
				 A[row][col]= sc.nextInt();
				 
			}
		}
		System.out.println("A matrix: ");
		//display A matrix
		for(int row = 0; row<2; row++) {
			for(int col = 0; col<3; col++){
				System.out.print(A[row][col]+"  ");
			}
			System.out.println();
		}
		//input B matrix
				for(int row = 0; row<2;row++) {
					for(int col = 0; col<3;col++) {
						System.out.printf("B[%d][%d] = ",row,col);
					
						 B[row][col]= sc.nextInt();
						 
					}
				}
				System.out.println("B matrix: ");
				//display A matrix
				for(int row = 0; row<2; row++) {
					for(int col = 0; col<3; col++){
						System.out.print(B[row][col]+"  ");
					}
					System.out.println();
				}
		// sum of A,B in C 
				for(int row = 0; row<2;row++) {
					for(int col = 0; col<3;col++) {
						
					
						 C[row][col]= A[row][col] + B[row][col];
						 
					}
				}
				//display A matrix
				System.out.println("Sum of A and B: ");
				for(int row = 0; row<2; row++) {
					for(int col = 0; col<3; col++){
						System.out.print(C[row][col]+"  ");
					}
					System.out.println();
				}
				
				
		
		

	}

}
