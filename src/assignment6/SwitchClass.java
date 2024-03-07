package assignment6;

import java.util.Scanner;

public class SwitchClass {
	// switch assignment: call center
	// if user select option 1 then set language bengali
	// if user select option 2 then set language hindi
	// if user select option 3 then set language urdu
	// for any other option set language english
	
	public static void main(String[] args) {
		System.out.println("select option:");
		Scanner sd = new Scanner(System.in);
		int option = sd.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("set language bengali");
			break;
			
		case 2:
			System.out.println("set language hindi");
			break;
		case 3:
			System.out.println("set language urdu");
			break;
			
		default:
			System.out.println("default set language english");
				
			
		}
	}
	

}
