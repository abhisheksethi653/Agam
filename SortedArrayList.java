package Package1;

import java.util.ArrayList;
import java.util.Collections;

public class SortedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("AA");
		arraylist.add("ZZ");
		arraylist.add("CC");
		arraylist.add("FF");
		
	/* Unsorted List: ArrayList content before sorting */
	System.out.println("Before sorting");
	for(String str: arraylist)
	{
		System.out.println(str);
	}
	
	/* Sorting in decreasing order */
	Collections.sort(arraylist, Collections.reverseOrder());
	//sort is predefined method of collections class
	
	/* Sorted List in reverse order */
	System.out.println("ArrayList in decreasing order");
	for (String str: arraylist)
	{
		System.out.println(str);
	}
	
	}

}
