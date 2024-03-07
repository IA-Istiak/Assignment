package string;


import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		StringBuffer aa = new StringBuffer(a);
		String b = aa.reverse().toString();
		
		if(a.equals(b)) {
			System.out.println("The string is palindrom");
		}
		else {
			System.out.println("The string is not palindrom");
		}
		

	}

}
