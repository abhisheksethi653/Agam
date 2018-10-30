package Package1;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverriding p = new MethodOverriding();
p.eat();
Boy q = new Boy();
q.eat();
	}

	public void eat()
	{
		System.out.println("Human is eating");
	}
}
	
	class Boy extends MethodOverriding{
		//Overriding method
		public void eat(){
			System.out.println("Boy is eating");
		}
	}


