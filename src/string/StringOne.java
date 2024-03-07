package string;

public class StringOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstName = "Istiak";
		String LastName = " Ahamed";
		
		String F1 = FirstName.replace("I", "E");
		System.out.println(F1);
		//String FullName = FirstName+LastName;
		String FullName = FirstName.concat(LastName);
		System.out.println(FullName);
		String UpperName = FullName.toUpperCase();
		String LowerName = FullName.toLowerCase();
		System.out.println(UpperName);
		System.out.println(LowerName);
		
		StringBuffer sb = new StringBuffer("Shakib");
		System.out.println(sb);
		sb.append(" Khan");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
