package Package1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add("Ravi");
		mylist.add("Ravi");
		mylist.add("Ramesh");
		mylist.add("Ravi");
		
		Iterator<String> itr =mylist.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		for(int i=0;i<mylist.length;i++)
		{
			System.out.println(mylist[i]);
		}
	}

}
