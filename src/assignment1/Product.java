package assignment1;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assignment-1 (Variable and Data type)
		 * step 1: create a class called Product
		 * step 2: create a main method
		 * step 3: declare variables: id, title, price, description, category
		 * step 4: assign the following data in main method
		101,iphone15,1895 euros,perfect product with best image quality, phone,
		* step 5: print the data
		 */
		int id = 101;
		String title = "iphone15";
		String price = "1895 euros";
		String description = "perfect product with best image quality";
		String category = "phone";
		
		char[] charArray = category.toCharArray();
		//System.out.println("Current array" + charArray.toString());
		System.out.println( charArray);
		
		for(int i =0, j= charArray.length-1; i<j; i++,j--) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		
		System.out.println( charArray);
		
		System.out.println(id);
		System.out.println(title);
		System.out.println(title.length());
		System.out.println(price);
		System.out.println(description);
		System.out.println(category);
		
		

	}

}
