package Package1;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Ravi");
		hs.add("Vijay");
		hs.add("Ajay");
		
		Iterator<String> itr =hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(hs);	
	}

}
