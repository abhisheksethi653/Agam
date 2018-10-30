package Package1;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0;
		int n=20;
		try{
			int fraction = n/d;
			System.out.println("result is "+fraction);
		}
		catch(ArithmeticException e){
			System.out.println("Error is "+e);
		}
		
		
	}

}
