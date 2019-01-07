package ExampleCollectionofCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class SchoolandClassExample {

	public static void main(String[] args) {
		
		ArrayList s = new ArrayList();
		ArrayList c1 = new ArrayList();
		ArrayList c2 = new ArrayList();
		ArrayList c3 = new ArrayList();
		c1.add("A"); c1.add("B"); c1.add("C");
		c2.add("D"); c2.add("E"); c2.add("F");
		c3.add("G"); c3.add("H"); c3.add("I");
		s.add(c1); s.add(c2); s.add(c3);
		System.out.println(s);
		System.out.println("School s size = "+s.size());
		
		Iterator si = s.iterator();
		while(si.hasNext()) {
			ArrayList cd = (ArrayList) si.next();
			Iterator ci = cd.iterator();
			while(ci.hasNext()) {
				String sn = (String) ci.next();
				System.out.println("Mr."+sn);
			}
		}
		System.out.println("------------------------------------");
		
		ArrayList ns = new ArrayList();
		ns.addAll(c1);
		ns.addAll(c2);
		ns.addAll(c3);
		
		System.out.println("School ns size is "+ ns.size());
		for(Object obj:ns) {
			String name = (String) obj;
			System.out.println("Mr. "+name);
			
		}

		
	}

}
