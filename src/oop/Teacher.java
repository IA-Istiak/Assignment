package oop;

public class Teacher {
	String name, address;
	int phone;
	public void setInformation(String n,String a, int p) {
		name = n;
		address = a;
		phone = p;
	}
	public void details() {
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
	}

}
