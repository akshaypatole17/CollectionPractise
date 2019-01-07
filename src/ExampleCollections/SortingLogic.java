package ExampleCollections;

import java.util.Comparator;

public class SortingLogic implements Comparator {

	public static void main(String[] args) {

	}

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		//int d = e2.id - e1.id;
		int d1 = e2.bs - e1.bs;
		if(d1==0) {
			//d = e1.id - e2.id;
			d1 = e1.bs - e2.bs;
		}
		return d1;
	}

}
