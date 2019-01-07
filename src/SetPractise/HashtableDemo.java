package SetPractise;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		Hashtable data = new Hashtable();
		data.put("Sachin", "Laxmi Nagar");
		data.put("Amit", "Bajaj Nagar");
		data.put("Dinesh", "Shankar Nagar");
		data.put("Bhushan", "Laxmi Nagar");
		data.put("Sachin", "Vasant Nagar");
		
		Enumeration e = data.keys();
		while(e.hasMoreElements()) {
			String k = (String) e.nextElement();
			String v = (String) data.get(k);
			System.out.println(k+" "+v);
		}

	}

}
