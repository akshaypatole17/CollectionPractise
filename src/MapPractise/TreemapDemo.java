package MapPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreemapDemo {

	public static void main(String[] args) {
		
		TreeMap data = new TreeMap();
		data.put("Sachin", "Laxmi Nagar");
		data.put("Amit", "Bajaj Nagar");
		data.put("Dinesh", "Shankar Nagar");
		data.put("Bhushan", "Laxmi Nagar");
		data.put("Sachin", "Vasant Nagar");
		System.out.println(data);
		System.out.println("-----------------------------------------");
		
		Set s = data.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			String k = (String) e.getKey();
			String v = (String) e.getValue();
			System.out.println("Mr. "+k+" is living in "+v+ " area.");
		}
	}

}
