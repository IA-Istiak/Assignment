package inheritance;

public class Teacher extends Person {
	String subject;
	
	public void display2() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(subject);
	}
	@Override
	public void display1() {
		System.out.println(subject);
		System.out.println("yoyyooy");
	}

}
