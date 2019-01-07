package ExampleCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSetGenericsDemo {

	public static void main(String[] args) {
		
		TreeSet<Employee> e1 = new TreeSet<Employee>(new SortingLogic2() {});
		
		e1.add(new Employee(01, "Akshay", "QA Engineer", "QA", 5000));
		e1.add(new Employee(02, "Vivek", "QA Engineer", "QA", 5000));
		e1.add(new Employee(03, "Sonu", "SDET", "QA", 10000));
		e1.add(new Employee(04, "Rahul", "Senior Software Engineer", "QA", 7500));	
		
		Iterator<Employee> itr = e1.iterator();
		while(itr.hasNext()){
			Employee e = itr.next();
			System.out.println(e);
		}
		System.out.println("--------------------------------------------------------");
		
		for(Employee e: e1) {
			System.out.println(e);
		}
		
	}

}
