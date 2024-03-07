package recursion;

public class RecursionDemo {
	

	 int fact(int a) {
		// TODO Auto-generated method stub
		 if(a == 1) {
				return 1;
			}
			else 
				return a*fact(a-1);
		
	}

}
