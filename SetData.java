package Package1;

public class SetData {
	int a;
	int b;
	
	public void SetDat(int a, int b)
	{
		this.a =a;
		this.b =b;
	}
	
	public void ShowDat(){
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
	
	public static void main(String args[]){
		SetData a1 = new SetData();
		a1.SetDat(4,5);
		a1.ShowDat();
	}
}
