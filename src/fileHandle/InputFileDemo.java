package fileHandle;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class InputFileDemo {
	

	public static void main(String[] args) {
		String id,name;
		// TODO Auto-generated method stub
		try {
			Formatter formatter = new Formatter("C:/Users/pc/Desktop/InputOutput.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("How many students:");
			int number = sc.nextInt();
			for(int i = 1; i<=number;i++) {
				System.out.println("Enter student id and name:");
				id = sc.next();
				name = sc.next();
				formatter.format("%s %s\r\n", id,name);
				
			}
			
			
			
			
			formatter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
