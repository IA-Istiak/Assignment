package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.name = "Istiak";
		t.age = 28;
		t.subject = "CSE";
		
		t.display2();
		t.display1();
		
		System.out.println("Hellow");
		
		Person p = new Teacher();
		
		p.display1();
		
		 

	}

}
