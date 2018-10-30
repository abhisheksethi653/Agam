package Package1;
import java.util.*;
import java.util.Map.Entry;
public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		h1.put(100, "Ravi");
		h1.put(101,"Ajay");
		h1.put(102, "Shyaam");
		for(Entry<Integer, String> m:h1.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(h1);
	}

}
