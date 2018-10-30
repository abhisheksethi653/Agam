package Package1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] mylist = {1.9,2.9,3.4,3.5};
		
		for(int i=0;i<mylist.length;i++)
		{
			System.out.println(mylist[i] +"");
		}
		
		//sum of all elements
		double total =0;
		for(int i=0;i<mylist.length;i++)
			total = total+mylist[i];
		System.out.println("total is"+total);
		
		//find largest element
		double max=0;
		for(int i=0;i<mylist.length;i++)
		{
			if(max<mylist[i]) max=mylist[i];
			
		}
		System.out.println("max is"+max);
	}

}
