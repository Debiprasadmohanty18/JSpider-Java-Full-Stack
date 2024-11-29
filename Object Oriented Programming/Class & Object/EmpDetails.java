package com.JSP.Object;

class Emp {
	
	String name;
	int age;
	int empId;
	
	public void display()
	{
		Emp e = new Emp();
		System.out.println(e.name + " " + e.age + " " + e.empId); // Default Values
		System.out.println(name + " " + age + " " + empId); // The Data You Passed using reference variable.
	}
}

public class EmpDetails {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.name = "Sambit";
		e1.age = 23;
		e1.empId = 123;
		
		e1.display(); // Null 0 0
	}
}
