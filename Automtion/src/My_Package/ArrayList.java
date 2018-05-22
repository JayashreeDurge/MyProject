package My_Package;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

class Pen{
	String color ;
	String brand ;
	Pen(String color, String brand){
		this.color = color;
		this.brand = brand;
	}
	public String toString() {
		return "Color is "+color+"& brand is "+brand;
	
	}
}
class Studentt{
	int id;
	String name;
	Studentt(int id, String name){
		this.id = id ;
		this.name = name ;
	}
	public String toString() {
		return  "Id is "+id+"& name is "+name;
	}
}
class Book{
	int pages;
	double price ;
	Book(int pages, double price){
		this.pages = pages;
		this.price = price;
	}
	public String toString() {
		return "Pages are "+pages+" & price is "+price;
}
}
class Employee{
	int id ;
	String name;
	Employee(int id, String name){
		this.id = id ;
		this.name = name ;
	}
	void method()
	{
		System.out.println("method");
	}
	public String toString() {
		return "Id is "+id+" & name is "+name;
}
}
public  class ArrayList {
	public static void main(String[] args) {
//  java.util.ArrayList<Object> arr = new java.util.ArrayList<>();
//	Vector arr = new Vector();
//	LinkedList arr = new LinkedList();
	LinkedHashSet<Object> arr = new LinkedHashSet<Object>();
	arr.add(new Pen("red","Reynolds"));
	arr.add(new Student(5, "Jaya"));
	arr.add(new Book(50, 100.0));
	arr.add(new Employee(10, "Pratik"));
	arr.add("Java");
	arr.add("Java");
	arr.add(new Employee(10, "Pratik"));
	System.out.println(arr.size());
	for (Object o :arr) {
		System.out.println(o);
	}
	}

}

