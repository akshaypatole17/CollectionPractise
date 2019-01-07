package MapPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashmapGenericsDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> data = new HashMap<String, String>();
		data.put("Sachin", "Laxmi Nagar");
		data.put("Amit", "Bajaj Nagar");
		data.put("Dinesh", "Shankar Nagar");
		data.put("Bhushan", "Laxmi Nagar");
		data.put("Sachin", "Vasant Nagar");
		System.out.println(data);
		System.out.println("-----------------------------------------");
		
		Set<Entry<String, String>> s = data.entrySet();
		Iterator<Entry<String, String>> itr = s.iterator();
		while(itr.hasNext()) {
			Entry<String, String> e = itr.next();
			String k = (String) e.getKey();
			String v = (String) e.getValue();
			System.out.println("Mr. "+k+" is living in "+v+ " area.");
		}
 
	}

}
