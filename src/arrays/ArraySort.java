package arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {100,-44,0,5,56};
		Arrays.sort(arr);
		for(int i =0; i<5;i++) {
			System.out.print(" " +arr[i] );
		}
		System.out.println();
		for(int i =4; i>=0;i--) {
			System.out.print(" " +arr[i] );
		}

	}

}
