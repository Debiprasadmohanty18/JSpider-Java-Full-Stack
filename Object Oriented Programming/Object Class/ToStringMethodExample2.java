package com.JSP.ObjectClass;

class Employee {
	String name;
	int age;
	int empId;
	public Employee(String name, int age, int empId) {
		this.name = name;
		this.age = age;
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "name = " + name + ", age = " + age + ", empId = " + empId;
	}
}

public class ToStringExample2 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Anil", 19, 1230);
		System.out.println(e1);

	}

}
