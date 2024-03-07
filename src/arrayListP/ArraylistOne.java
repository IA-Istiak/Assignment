package arrayListP;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>number = new ArrayList<Integer>();
		System.out.println("Size:" + number.size());
		number.add(100);
		number.add(2);
		number.add(-3);
		number.add(3, 4);
		System.out.println(number);
		System.out.println("Size:" + number.size());
		
		for(int x : number) {
			System.out.print(x+" ");
		}
		
		Collections.sort(number);

		System.out.println(number);
		Collections.sort(number,Collections.reverseOrder());
		System.out.println(number);

	}

}
