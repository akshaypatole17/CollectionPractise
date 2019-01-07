package ExampleCollections;

public class Employee {

	int id, bs;
	String name, desig, dept;
	int da, pa, tax;
	
	public Employee(int id, String name, String desig, String dept, int bs) {
		this.id = id;
		this.name = name;
		this.desig = desig;
		this.dept = dept;
		this.bs = bs;
	}
	
	public String toString() {
		return (id+" "+name+" "+desig+" "+dept+" "+bs+" ");
		
	}
	
}
