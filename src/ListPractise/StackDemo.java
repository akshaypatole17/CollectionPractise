package ListPractise;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack data = new Stack(); //Stack is Legacy Class or AddOn Class
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
		data.push("Vaibhav");
		data.push("Alkesh");
		data.push("Vedant");
		//System.out.println(data.peek());
		//System.out.println(data.pop());
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

