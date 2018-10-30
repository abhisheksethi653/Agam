package Package1;

public interface Interface {
	 public void test();
	 public void greeting();
 }
 
class dog implements Interface{
	 //all the methods in the interface should be implemented
	 public void test(){
		 System.out.println("Interface Implemented");
	 }
	public void greeting(){
		System.out.println("Hi");
	}
	 
 
	public static void main(String[] args) {
		// Static methods can only be returned in outer class or static class
 Interface p = new dog();
 p.test();
 p.greeting();
	}

}

