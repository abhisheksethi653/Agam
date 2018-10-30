package Package1;



abstract class Animal{
	public abstract void sound(); // if I define a body, it will work and I wont need to define abstract
	public void color(){
		System.out.println("color is grey");
	}
	
}
public class AbstractExample extends Animal{

	public void sound(){
		System.out.println("woof");
	}
	public void color(){
		System.out.println("color is green");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractExample a1 = new AbstractExample();
a1.sound();
a1.color();
	}

}
