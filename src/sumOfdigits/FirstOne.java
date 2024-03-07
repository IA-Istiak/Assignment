package sumOfdigits;

import java.util.Scanner;

public class FirstOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// digit like 123 >> sum like 1+2+3
		//num = 123
		// temp = num
		//sum = 0
		// r = temp%10
		//sum = sum+r
		//temp = temp/10
		//process ta whle loop e temp !=0 condition porjonto cholnbe.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int r;
		while(temp!=0){
			r = temp%10;
			sum = sum+r;
			temp = temp/10;
		}
		System.out.println(sum);
		
		
		

	}

}
