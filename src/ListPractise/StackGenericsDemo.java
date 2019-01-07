package ListPractise;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackGenericsDemo {
	public static void main(String[] args) {
		Stack<String> data = new Stack<String>();
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
		
		try {
			System.out.println(data.pop());
			System.out.println(data.pop());
			System.out.println(data.pop());
			System.out.println(data.pop()); //EmptyStackException
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}

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
