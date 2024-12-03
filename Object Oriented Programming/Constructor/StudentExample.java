package com.JSP.Constructor;

public class StudentExample {
	
	String name;
	int age;
	
	public StudentExample(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println("Name :- " + name);
		System.out.println("Age : - " + age);
	}

	public static void main(String[] args) {
		
		StudentExample ob1 = new StudentExample("Debiprasad", 18);
		ob1.display();
		System.out.println("====================");
		StudentExample ob2 = new StudentExample("Asish", 45);
		ob2.display();
		
	}

}
