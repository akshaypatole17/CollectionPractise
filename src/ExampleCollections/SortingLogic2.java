package ExampleCollections;

import java.util.Comparator;

public abstract class SortingLogic2 implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return (o1.id - o2.id);
	}

}
