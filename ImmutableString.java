package Package1;

public class ImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin";
		s.concat(" Tendulkar");
		//concat() method appends the string at the end
		System.out.println(s);
		//print Sachin because strings are immutable objects
		
		s = s.concat("Ganguly");
		System.out.println(s);
	}

}
