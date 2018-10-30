package Package1;

public class MethodOverload {
	// Overload sum()
	public int sum(int a, int b){
		return a+b;
	}
	public int sum(int a, int b , int c){
		return a+b+c;
	}
	public float sum(float a, float b){
		return a+b;
	}
	
public static void main(String[] args){
	MethodOverload a1 = new MethodOverload();
	System.out.println(a1.sum(4, 5));
	System.out.println(a1.sum(4,5,6));
	System.out.println(a1.sum(4.5f, 5.6f));
}
}
