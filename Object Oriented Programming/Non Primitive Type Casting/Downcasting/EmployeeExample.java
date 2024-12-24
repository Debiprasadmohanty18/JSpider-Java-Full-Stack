package com.JSP.Non_Primitive_Type_Casting.Downcasting;

class Employee {
	String name;
	int age;
	int empId;
	public Employee(String name, int age, int empId) 
	{
		this.name = name;
		this.age = age;
		this.empId = empId;
	}
}

public class EmployeeExample {
	
	public static void display(Object o)
	{
		Employee e1 = (Employee) o;
		System.out.println(e1.name + "\n" + e1.age + "\n" + e1.empId);
	}

	public static void main(String[] args) {		
		Employee ob1 = new Employee("Virat", 18, 9875);
		Employee ob2 = new Employee("Rohit", 45, 1234);
		display(ob1);
		System.out.println("=============");
		display(ob2);
	}

}
