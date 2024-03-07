package staticPractice;

public class StaticKeyword {

	String name;
	int id;
	static String University = "IUBAT";
	static int count = 0;

	StaticKeyword(){
		count++;
	}

	StaticKeyword(String n, int i) {
		// TODO Auto-generated constructor stub
		name = n;
		id = i;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("University: " + University);
		
	}
	void display2() {
		System.out.println(count);
	}

}
