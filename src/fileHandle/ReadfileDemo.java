package fileHandle;

import java.io.File;
import java.util.Scanner;

public class ReadfileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:/Users/pc/Desktop/InputOutput.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				String id = sc.next();
				String name = sc.next();
				System.out.println("ID: " + id+ " Name: " +name);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
