package arrays;

public class ArrayDiffcolnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int[4][];
		arr[0] = new int[1]; 
		arr[1] = new int[2]; 
		arr[2] = new int[3]; 
		arr[3] = new int[4]; 
		int k = 0;
		for(int row = 0; row<4; row++) {
			for(int col = 0; col<row+1; col++) {
				arr[row][col] = k;
				System.out.print(arr[row][col] + " ");
				k++;
			} 
			System.out.println();
		}

	}

}
