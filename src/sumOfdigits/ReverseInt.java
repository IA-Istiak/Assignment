package sumOfdigits;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// digit like 123 >> Reverse like 321
				//num = 123
				// temp = num
				//rev = 0
				// r = temp%10
				//rev = rev*10+r
				//temp = temp/10
				//process ta whle loop e temp !=0 condition porjonto cholnbe.
				
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num  = dc.nextInt();
		int temp = num;
		int rev=0;
		int r ;
		while(temp!=0) {
			r = temp%10;
			rev = rev*10+r;
			temp = temp/10;
		}
		System.out.println( rev);

	}

}
