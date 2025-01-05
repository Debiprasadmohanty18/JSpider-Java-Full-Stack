package com.JSP.Cloning;

class Place implements Cloneable {
	String city;
	String country;
	
	public Place(String city, String country) 
	{
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address city=" + city + ", country=" + country;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	
}

class Student implements Cloneable {
	String name;
	int age;
	Place place;
	
	public Student(String name, int age, Place address) 
	{
		this.name = name;
		this.age = age;
		this.place = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + place + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		Student s = (Student) super.clone();
		s.place = (Place) place.clone();
		return s;
	}
}

public class DeepCloningExample {

	public static void main(String[] args) throws CloneNotSupportedException 
	{	
		Student s1 = new Student("Rohit", 20, new Place("Delhi", "India"));
		Student s2 = (Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("==========================");
		s2.place.city = "Mumbai";
		System.out.println(s1);
		System.out.println(s2);
	}

}
