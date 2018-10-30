package Package1;

public class parent {
	String color = "white";
	public void barking()
	{
		System.out.println("Parent Dog is barking");
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stub
parent p1 = new parent();
System.out.println(p1.color);
p1.barking();
parent p2 = new child();
System.out.println(p2.color);
p2.barking();
child p3 = new child();
System.out.println(p3.color);
p3.barking();

	}
}

 class child extends parent{
	String color ="black and white";
	public void barking()
	{
		System.out.println("Child dog is barking");
	}
}

