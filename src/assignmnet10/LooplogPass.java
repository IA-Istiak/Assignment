package assignmnet10;

import java.util.Scanner;

public class LooplogPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// validate user based on username and password
		// input username and password until username=="anis" and password=="123456"
		// if username and password does not match print "username/password is incorrect. Please try again"
		// if username and password does not match print "welcome to the system"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName :");
		String username = sc.nextLine();
		System.out.println("Enter Password :");
		String password = sc.nextLine();
		
		
			while(!username.equals("anis")|| !password.equals("123456")) {
				System.out.println("username/password is incorrect. Please try again");
				System.out.println("Enter UserName :");
				 username = sc.nextLine();
				System.out.println("Enter Password :");
				 password = sc.nextLine();
				 
			}
			if(username.equals("anis")&& password.equals("123456")) {
				System.out.println("welcome to the system");}
	

	}

}
