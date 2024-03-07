package arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][5];
		int k = 0;
		for(int row = 0; row<4; row++) {
			for(int col = 0; col<5; col++) {
				arr[row][col] = k;
				System.out.print(arr[row][col] + " ");
				k++;
			} 
			System.out.println();
		}

	}

}
