package arrays;

import java.util.Scanner;

public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[10];
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Number" + (i + 1));
			double num = sc.nextDouble();
			arr[i] = num;
			sum = sum + arr[i];
			avg = sum / arr.length;
		}
		System.out.println("Total " + sum);
		System.out.println("Total " + avg);
	    double max = arr[0];
	    double min = arr[0];
	    for(int i =1; i<arr.length;i++) {
	    	if(max<arr[i]) {
	    		max = arr[i];
	    	}
	    }
	    System.out.println("Max value is" + max);
	    for(int i =1; i<arr.length;i++) {
	    	if(min>arr[i]) {
	    		min = arr[i];
	    	}
	    }
	    System.out.println("Min value is" + min);

	}

}
