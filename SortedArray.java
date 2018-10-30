package Package1;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter no of elements");
		n = s1.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements");
		for(int i=0;i<n;i++)
		{
			a[i] =s1.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("Ascending Order");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(a[i] + ",");
		}
		System.out.println(a[n-1]);
	}

}
