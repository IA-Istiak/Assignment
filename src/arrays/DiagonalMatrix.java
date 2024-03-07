package arrays;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] A = new int[3][3];

		int sumofDiagonal = 0;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col] = sc.nextInt();
			}
		}
		System.out.println();
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(A[row][col] + " ");

			}
			System.out.println();
		}
		// diagonal matrix
		System.out.println("diagonal matrix: ");

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (row == col) {

					System.out.println(A[row][col]);
					sumofDiagonal = sumofDiagonal + A[row][col];
				}

			}

		}
		System.out.println("Upper Triangle Elements: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (row < col) {

					System.out.println(A[row][col]);
					
				}

			}

		}
		
		System.out.println("lower Triangle Elements: ");
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (row > col) {

					System.out.println(A[row][col]);
					
				}

			}

		}

	}

}
