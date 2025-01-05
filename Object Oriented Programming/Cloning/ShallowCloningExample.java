package com.JSP.Cloning;

class Address implements Cloneable {
	String city;
	String country;
	
	public Address(String city, String country) 
	{
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return " city=" + city + ", country=" + country;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}	
}

class Person implements Cloneable {
	String name;
	int age;
	Address address;
	
	public Person(String name, int age, Address address) 
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address --> " + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();		
	}
}

public class ShallowCloningExample {

	public static void main(String[] args) throws CloneNotSupportedException 
	{	
		Person p1 = new Person("Rohit", 20, new Address("Delhi", "India"));
		Person p2 = (Person) p1.clone();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("==========================");
		p2.address.city = "Mumbai";
		System.out.println(p1);
		System.out.println(p2);
	}

}
