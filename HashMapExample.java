package Package1;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100, "Amit");
		hm.put(101,"Vijay");
		hm.put(102,  "Rahul");
		for(Entry<Integer, String> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(hm);
		
		for (int key : hm.keySet()) {
			   System.out.println("------------------------------------------------");
			   System.out.println("Iterating or looping map using java5 foreach loop");
			   System.out.println("key: " + key + " value: " + hm.get(key));
			}
	}

}
