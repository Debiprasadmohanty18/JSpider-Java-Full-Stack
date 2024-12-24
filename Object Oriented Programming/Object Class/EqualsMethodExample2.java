package com.JSP.ObjectClass;

class Student {
	int age;
	int id;
	public Student(int age, int id) {
		this.age = age;
		this.id = id;
	}
	@Override
	public String toString() {
		return "age = " + age + ", id = " + id;
	}
	@Override
	public boolean equals(Object obj) 
	{	
		Student ob = (Student) obj; // Down-Casting
		return age == ob.age && id == ob.id;
	}	
}

public class EqualsMethodExample2 {

	public static void main(String[] args) {
		
		Student ob1 = new Student(18,1234);
		Student ob2 = new Student(22,9876);
		
		System.out.println(ob1 == ob2); // False
		System.out.println(ob1.equals(ob2)); // False

	}

}
