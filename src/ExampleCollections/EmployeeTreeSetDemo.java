package ExampleCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSetDemo {

	public static void main(String[] args) {
		
			Employee e2 = new Employee(05, "Alkesh", "Java Developer" , "Development", 12000);
			Employee e3 = new Employee(06, "Vedant", "Software Developer" , "Development", 12000);
			Employee e4 = new Employee(07, "Nikhil", "Solution Engineer" , "QA", 5500);
			
			TreeSet e1 = new TreeSet(new SortingLogic());
			e1.add(new Employee(01, "Akshay", "QA Engineer", "QA", 5000));
			e1.add(new Employee(02, "Vivek", "QA Engineer", "QA", 5000));
			e1.add(new Employee(03, "Sonu", "SDET", "QA", 10000));
			e1.add(new Employee(04, "Rahul", "Senior Software Engineer", "QA", 7500));
			e1.add(e2);
			e1.add(e3);
			e1.add(e4);
			
			Iterator itr = e1.iterator();
			while(itr.hasNext()) {
				Employee e = (Employee) itr.next();
				System.out.println(e);
			}
			System.out.println("-------------------------------------------------------------------");
			
			for(Object emp:e1) {
				System.out.println(emp);
			}
	}

}
