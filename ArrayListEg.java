package Package1;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[2];
		arr[0] =1;
		arr[1] =2;
		//arr[3] =3;
		System.out.println(arr[0]);
		System.out.println(arr);
		
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>(1);
		arr2.add(1);
		arr2.add(2);
		arr2.add(3);
		arr2.add(4);
		
		System.out.println(arr2.get(0));
		System.out.println(arr2.get(1));
		System.out.println(arr2);
		
		
	}

}
