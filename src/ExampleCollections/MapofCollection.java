package ExampleCollections;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class MapofCollection {

	public static void main(String[] args) {
		
		TreeMap s1 = new TreeMap();
		ArrayList c1 = new ArrayList();
		c1.add("A"); c1.add("B");
		ArrayList c2 = new ArrayList();
		c2.add("C"); c2.add("D");
		s1.put("C1", c1);
		s1.put("C2", c2);
	  	
		TreeMap s2 = new TreeMap();
		ArrayList c3 = new ArrayList();
		c3.add("E"); c3.add("F");
		ArrayList c4 = new ArrayList();
		c4.add("G"); c4.add("H");
		s2.put("C3", c3);
		s2.put("C4", c4);
		
		ArrayList zp = new ArrayList();
		zp.add(s1);
		zp.add(s2);
		
		for(Object so: zp) {
			TreeMap s = (TreeMap) so;
			Set cl = s.keySet();
			for(Object co:cl) {
				String cn = (String) co;
				System.out.println(cn);
				System.out.println("----------------------------------------");
				ArrayList sl = (ArrayList) s.get(cn);
				for(Object n:sl) {
					String name = (String) n;
					System.out.println(name);
				}
				System.out.println(" ");
			}
		}
		
	}

}
