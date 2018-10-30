package Package1;

public class MethodCall {
  static int c;
 
 public int addition(int a, int b)
 {
	 c = a+b;
	 return c;
 }

public static void main(String[] args)
{
	MethodCall a1 = new MethodCall();
	 c= a1.addition(4,5);
	System.out.println(c);
}
}
