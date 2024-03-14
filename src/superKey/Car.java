package superKey;

public class Car extends Vechile {
	int gear;

	Car(String c, double w,int g) {
		super(c, w);
		gear = g;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void attribute() {
		super.attribute();
		System.out.println("Gear" +gear);
	}
	

}
