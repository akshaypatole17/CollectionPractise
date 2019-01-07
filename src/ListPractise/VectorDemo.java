package ListPractise;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector data = new Vector(); // Vector is Legacy Class or AddOn Class. FIFO Property.
		data.add("Audi");
		data.add("Ferrari");
		data.add("BMW");
		data.add("Lamborghini");
		data.add("GM");
		data.add("Hyundai");
		data.add("Isuzu");
		data.add("Suzuki");
		data.add("Suzuki"); //Duplicates allowed.
		//data.addFirst("Akshay"); //Add element of 0th index.

		//To print all data at once inside square bracket.
		System.out.println(data); 
		System.out.println("-----------------------------");
		
		//To access elements earlier java provides enumeration.
		Enumeration e = data.elements();
		while(e.hasMoreElements()) {
			String s1 = (String) e.nextElement();
			System.out.println("Name of Car is "+ s1);
		}
		System.out.println("-----------------------------");
				
		//To access elements of ArrayList one by one using iterator.
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("Name of Car is "+ s);
		}
		System.out.println("-----------------------------");
		
		//To access elements of ArrayList one by one using for each loop.
		for(Object car: data) {
			System.out.println("Name of Car is "+ car);
		}
	}

}
