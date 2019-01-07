package ListPractise;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListGenericsdemo {
	public static void main(String[] args) {
		LinkedList<String> data = new LinkedList<String>();
		data.add("Audi");
		data.add("Ferrari");
		data.add("BMW");
		data.add("Lamborghini");
		data.add("GM");
		data.add("Hyundai");
		data.add("Isuzu");
		data.add("Suzuki");
		data.add("Suzuki"); //Duplicates allowed.
		data.addFirst("Akshay"); //Add element of 0th index.

		//To print all data at once inside square bracket.
		System.out.println(data); 
		System.out.println("-----------------------------");
		
		//To access elements of ArrayList one by one using iterator.
		Iterator<String> itr = data.iterator();
		while(itr.hasNext()) {
			String s = itr.next();
			System.out.println("Name of Car is "+ s);
		}
		System.out.println("-----------------------------");
		
		//To access elements of ArrayList one by one using for each loop.
		for(Object car: data) {
			System.out.println("Name of Car is "+ car);
		}
	}
}
